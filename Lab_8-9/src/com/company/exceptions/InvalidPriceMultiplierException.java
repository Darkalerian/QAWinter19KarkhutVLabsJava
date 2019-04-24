package com.company.exceptions;

public class InvalidPriceMultiplierException extends Exception {
    @Override
    public String getMessage() {
        return "price should be greater than zero  \n";
    }
}
