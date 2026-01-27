package com.christyjohn.springboot.cruddemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TaskRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<TaskErrorResponse> handleException(TaskNotFoundException exc) {
        TaskErrorResponse error = new TaskErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<TaskErrorResponse> handleException(TaskNotAllowedException exc) {
        TaskErrorResponse error = new TaskErrorResponse();
        error.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler
    public ResponseEntity<TaskErrorResponse> handleException(Exception exc) {
        TaskErrorResponse error = new TaskErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
