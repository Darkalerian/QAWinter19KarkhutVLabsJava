package com.javalab.karkhut;


public class Task2IntToBit {

    public String getByteRepresentation(int integerValue) {
        int byteValue;
        String temporaryValue = "";
        while (integerValue != 0) {
            byteValue = integerValue % 2;
            temporaryValue = byteValue + temporaryValue;
            integerValue = integerValue / 2;
        }
        return temporaryValue;
    }

}
