package com.mindtree.exception;

public class TaskManagementException extends Exception {

    private static final long serialVersionUID = 1L;

    public TaskManagementException(String errorMessage) {
        super(errorMessage);
    }

    public TaskManagementException(String errorMessage, Exception exception) {
        super(errorMessage, exception);
    }

}
