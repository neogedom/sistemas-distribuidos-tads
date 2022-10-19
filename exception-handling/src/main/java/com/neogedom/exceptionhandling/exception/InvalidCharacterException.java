package com.neogedom.exceptionhandling.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidCharacterException extends RuntimeException{
    public InvalidCharacterException(String message) {
        super(message);
    }
}
