package com.lcwd.user.service.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException() {
        super("RESOURCE NOT FOUND ON SERVER");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
