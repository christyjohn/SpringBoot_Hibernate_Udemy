package com.christyjohn.springboot.cruddemo.exceptions;

public class TaskNotAllowedException extends RuntimeException {
    public TaskNotAllowedException(String message) {
        super(message);
    }

    public TaskNotAllowedException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaskNotAllowedException(Throwable cause) {
        super(cause);
    }
}
