package org.mkhbeldi.dev.mpayments.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class PaymentUnableException extends RuntimeException{

    public PaymentUnableException(String message) {
        super(message);
    }
}
