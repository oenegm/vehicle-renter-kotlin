//package com.project.vehiclerenterkotlin.advice
//
//import com.amazonaws.AmazonServiceException
//import org.springframework.http.HttpHeaders
//import org.springframework.http.HttpStatus
//import org.springframework.web.bind.annotation.ControllerAdvice
//import org.springframework.web.bind.annotation.ExceptionHandler
//import java.io.FileNotFoundException
//import java.io.IOException
//
//@ControllerAdvice
//class FileUploadExceptionHandler : ResponseEntityExceptionHandler() {
//    @ExceptionHandler(value = [FileEmptyException::class])
//    protected fun handleFileEmptyException(
//        ex: FileEmptyException, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse: String = ex.getMessage()
//        return handleExceptionInternal(
//            ex, bodyOfResponse,
//            HttpHeaders(), HttpStatus.NO_CONTENT, request
//        )
//    }
//
//    @ExceptionHandler(value = [FileDownloadException::class])
//    protected fun handleFileDownloadException(
//        ex: FileDownloadException, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse: String = ex.getMessage()
//        return handleExceptionInternal(
//            ex, bodyOfResponse,
//            HttpHeaders(), HttpStatus.NOT_FOUND, request
//        )
//    }
//
//    @ExceptionHandler(value = [SpringBootFileUploadException::class])
//    protected fun handleConflict(
//        ex: SpringBootFileUploadException, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse: String = ex.getMessage()
//        return handleExceptionInternal(
//            ex, bodyOfResponse,
//            HttpHeaders(), HttpStatus.BAD_REQUEST, request
//        )
//    }
//
//    // Handle exceptions that occur when the call was transmitted successfully, but Amazon S3 couldn't process
//    // it, so it returned an error response.
//    @ExceptionHandler(value = [AmazonServiceException::class])
//    protected fun handleAmazonServiceException(
//        ex: RuntimeException, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse = ex.message
//        return handleExceptionInternal(
//            ex, bodyOfResponse,
//            HttpHeaders(), HttpStatus.CONFLICT, request
//        )
//    }
//
//    // Handle exceptions that occur when Amazon S3 couldn't be contacted for a response, or the client
//    // couldn't parse the response from Amazon S3.
//    @ExceptionHandler(value = [SdkClientException::class])
//    protected fun handleSdkClientException(
//        ex: RuntimeException, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse = ex.message
//        return handleExceptionInternal(
//            ex, bodyOfResponse,
//            HttpHeaders(), HttpStatus.SERVICE_UNAVAILABLE, request
//        )
//    }
//
//    @ExceptionHandler(value = [IOException::class, FileNotFoundException::class, MultipartException::class])
//    protected fun handleIOException(
//        ex: Exception, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse = ex.message
//        return handleExceptionInternal(
//            ex, bodyOfResponse,
//            HttpHeaders(), HttpStatus.BAD_REQUEST, request
//        )
//    }
//
//    @ExceptionHandler(value = [Exception::class])
//    protected fun handleUnExpectedException(
//        ex: Exception, request: WebRequest?
//    ): ResponseEntity<Any> {
//        val bodyOfResponse = ex.message
//        log.info("Exception ==> ", ex)
//        log.info("Fatal exception ===> {}", bodyOfResponse)
//        return handleExceptionInternal(
//            ex, "We apologize. Something is not right",
//            HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request
//        )
//    }
//}
