package com.company.exceptions;

public class InvalidContainerSizeException extends Exception {
    @Override
    public String getMessage() {
        return "Your container can't be empty or with negative size \n";
    }
}
