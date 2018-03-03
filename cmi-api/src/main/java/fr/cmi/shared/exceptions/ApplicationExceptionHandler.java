package fr.cmi.shared.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.nio.file.AccessDeniedException;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

    final static class ExceptionResponse {

        private final String message;
        private final String details;

        ExceptionResponse(String message, String details) {
            this.message = message;
            this.details = details;
        }

        public String getMessage() {
            return message;
        }

        public String getDetails() {
            return details;
        }
    }


    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionResponse> constraintViolationException(ConstraintViolationException ex, WebRequest req) {

        logger.error("Bad request parameter:", ex);

        String details = null;
        Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
        if (Objects.nonNull(violations)) {
            details = violations.stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(","));
        }
        return ResponseEntity.badRequest()
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .body(new ExceptionResponse("invalid parameter", details));
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    private ResponseEntity<ExceptionResponse> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, WebRequest req) {
        logger.info("Invalid argument exception", ex);
        return ResponseEntity.status(BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(new ExceptionResponse(BAD_REQUEST.getReasonPhrase(), ex.getMessage()));
    }

    @ExceptionHandler(value = {AccessDeniedException.class})
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    public ResponseEntity<ExceptionResponse> accessDeniedException(AccessDeniedException ex, WebRequest req) {
        logger.error("Access denied to path '" + req.getContextPath() + "' : " + ex.getMessage(), ex);
        return ResponseEntity
            .status(HttpStatus.FORBIDDEN)
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .body(new ExceptionResponse("access denied", ex.getMessage()));
    }

    @ExceptionHandler(value = {MissingServletRequestParameterException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ExceptionResponse> missingServletRequestParameterException(MissingServletRequestParameterException ex, WebRequest req) {
        logger.error("Missing request parameter for the path '" + req.getContextPath() + "' : " + ex.getMessage(), ex);
        return ResponseEntity
            .status(HttpStatus.BAD_REQUEST)
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .body(new ExceptionResponse("Missing parameter " + ex.getParameterName(), ex.getMessage()));
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ExceptionResponse> unknownException(Exception ex, WebRequest req) {
        logger.error("Unexpected exception", ex);
        return ResponseEntity.status(INTERNAL_SERVER_ERROR)
            .contentType(MediaType.APPLICATION_JSON_UTF8)
            .body(new ExceptionResponse(INTERNAL_SERVER_ERROR.getReasonPhrase(), ex.getMessage()));
    }


}
