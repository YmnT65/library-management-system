package com.library.library_management_system.utils.exceptions;

public class CustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CustomException(String message) {
        super(message);
    }
    
    public CustomException(String message, Throwable thrwbl) {
        super(message, thrwbl);
    }
    
    public CustomException(String message, Exception e) {
        super(message, e);
    }

}
