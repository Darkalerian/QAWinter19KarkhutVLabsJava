package com.company;

import java.util.Arrays;

class ArrayBuilder {

    int[] getArray() {
        ArrayTemplate myTemplateArray = new ArrayTemplate();
        int[] myArray = new int[myTemplateArray.getArraySize()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = generateRandomElements(myTemplateArray.getMinValue(), myTemplateArray.getMaxValue());
        }
        System.out.println("Your new array has been created: " + Arrays.toString(myArray));
        return myArray;
    }

    int[] getArray(int size) {

        if (size < 1) {
            return null;
        }
        ArrayTemplate myTemplateArray = new ArrayTemplate(size);
        int[] myArray = new int[myTemplateArray.getArraySize()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = generateRandomElements(myTemplateArray.getMinValue(), myTemplateArray.getMaxValue());
        }
        System.out.println("Your new array has been created: " + Arrays.toString(myArray));
        return myArray;
    }


    int[] getArray(int size, int min, int max) {
        if (size < 1) {
            return null;
        }
        ArrayTemplate myTemplateArray = new ArrayTemplate(size, min, max);
        int[] myArray = new int[myTemplateArray.getArraySize()];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = generateRandomElements(myTemplateArray.getMinValue(), myTemplateArray.getMaxValue());
        }
        System.out.println("Your new array has been created: " + Arrays.toString(myArray));
        return myArray;
    }


    private int generateRandomElements(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

}
