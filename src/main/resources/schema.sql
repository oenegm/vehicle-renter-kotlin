create extension if not exists "uuid-ossp";

create table if not exists users
(
    id         uuid primary key default uuid_generate_v4(),
    role       varchar(20)  not null,
    username   varchar(255) unique not null,
    password   varchar(255),
    created_at timestamp    not null
);

create table if not exists profiles
(
    id                   uuid primary key default uuid_generate_v4(),
    user_id              uuid references users (id),
    name                 varchar(45) not null,
    profile_picture_link varchar(255),
    bio                  text
);

create table if not exists communication_method_types
(
    id   uuid primary key default uuid_generate_v4(),
    name varchar(20) not null
);

create table if not exists communication_methods
(
    id         uuid primary key default uuid_generate_v4(),
    profile_id uuid references profiles (id),
    type       uuid references communication_method_types (id),
    value      varchar(255) not null
);

create table if not exists website_settings
(
    id           uuid primary key     default uuid_generate_v4(),
    user_id      uuid references users (id),
    is_dark_mode boolean     not null default true,
    language     varchar(20) not null default 'EN'
);

create table if not exists brands
(
    id         uuid primary key default uuid_generate_v4(),
    name       varchar(45) unique not null,
    country    varchar(45)        not null,
    image_link varchar(255)       not null
);

create table if not exists vehicles
(
    id                   uuid primary key        default uuid_generate_v4(),
    owner_id             uuid references users (id),
    brand_id             uuid references brands (id),
    model                varchar(45)    not null,
    year                 varchar(45)    not null,
    address              varchar(255)   not null,
    registration_number  varchar(45)    not null,
    color                varchar(45)    not null,
    number_of_doors      int2           not null default 4,
    number_of_seats      int2           not null default 4,
    vehicle_type         varchar(45)    not null,
    engine_type          varchar(45)    not null,
    fuel_type            varchar(45)    not null,
    transmission_type    varchar(45)    not null,
    vehicle_status       varchar(45)    not null,
    price_per_day        NUMERIC(11, 2) not null,


    image_link           varchar(255),
    successful_rentals   int            not null default 0,
    unsuccessful_rentals int            not null default 0,
    last_requested_at    timestamp,
    last_rented_at       timestamp
);

create table if not exists vehicle_settings
(
    id              uuid primary key default uuid_generate_v4(),
    vehicle_id      uuid references vehicles (id),
    is_visible      boolean not null default true,
    is_out_of_order boolean not null default false
);

create table if not exists rental_requests
(
    id             uuid primary key default uuid_generate_v4(),
    renter_id      uuid references users (id),
    vehicle_id     uuid references vehicles (id),
    request_date   date     not null,
    rent_date      date     not null,
    return_date    date     not null,
    duration       interval not null,
    accepted_price NUMERIC(11, 2)
);

create table if not exists ratings
(
    id                uuid primary key default uuid_generate_v4(),
    rental_request_id uuid references rental_requests (id),
    vehicle_rating    int2,
    owner_rating      int2,
    renter_rating     int2
)

