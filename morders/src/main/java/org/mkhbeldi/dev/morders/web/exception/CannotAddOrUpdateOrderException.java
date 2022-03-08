package org.mkhbeldi.dev.morders.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * If this exception occurs, there was an internal error.
 * If the request was malformed, it would have triggered 400 Bad Request automatically.
**/

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class CannotAddOrUpdateOrderException extends RuntimeException{

    public CannotAddOrUpdateOrderException(String message) {
        super(message);
    }
}
