package com.company.exceptions;

public class InvalidAuthorNameException extends Exception {
    @Override
    public String getMessage() {
        return "Author name can't be empty \n";
    }
}
