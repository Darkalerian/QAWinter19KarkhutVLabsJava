package com.company;

class ArrayTemplate {
    private int arraySize;
    private int minValue;
    private int maxValue;
    private String typeOfArray;

    ArrayTemplate() {
        this.arraySize = 10;
        this.minValue = -10;
        this.maxValue = 10;
        typeOfArray = "String";
    }

    ArrayTemplate(int arraySize) {
        this();
        this.arraySize = arraySize;
    }

    ArrayTemplate(int arraySize, int minValue, int maxValue) {
        this(arraySize);
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    int getArraySize() {
        return arraySize;
    }

    int getMinValue() {
        return minValue;
    }

    int getMaxValue() {
        return maxValue;
    }

    public String getTypeOfArray() {
        return typeOfArray;
    }
}
