package com.guesser.myfinances.exception;

public class BusinessRuleException extends RuntimeException{
    public BusinessRuleException(String msg) {
        super(msg);
    }
}
