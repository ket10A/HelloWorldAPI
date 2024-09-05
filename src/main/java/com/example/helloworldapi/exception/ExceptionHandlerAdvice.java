package com.example.helloworldapi.exception;

import com.example.helloworldapi.util.JsonResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ExceptionHandlerAdvice {

    HttpStatus status = HttpStatus.OK;

    public static String logFormat = "%s for: %s";
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JsonResponse> handleException(HttpServletRequest request,
                                                        Exception e) {
        log.error(String.format(logFormat, e.getMessage(), request.getRequestURI()), e);

        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        return ResponseEntity.status(this.status).body(new JsonResponse(null, e));

    }
}
