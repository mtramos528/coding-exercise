package com.ota.coding.challenge.exception;

import lombok.Getter;

@Getter
public class CodedException extends RuntimeException{

    private final String errorCode;

    public CodedException(String message, String code) {
        super(message);
        this.errorCode = code;
    }

}
