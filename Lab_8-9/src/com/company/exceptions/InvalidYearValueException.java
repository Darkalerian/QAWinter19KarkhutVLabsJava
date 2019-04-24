package com.company.exceptions;

public class InvalidYearValueException extends Exception {
    @Override
    public String getMessage() {
        return "Year is in wrong diapason \n";
    }
}
