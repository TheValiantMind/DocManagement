/**
 * Copyright (c) 2026 V K Deewakar. All Rights Reserved.
 */
package com.assignment.InstaIndex.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidRequestException extends RuntimeException {
    public InvalidRequestException(String exception){
        super(exception);
    }
}
