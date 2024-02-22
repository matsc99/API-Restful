package com.mateuscruz.api.services.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg) {

        super(msg);
    }
}
