package com.javalab.karkhut;

class ReverseAndSubtract {
    private int reversedNumber;
    private int inputNumber;
    private int initialInputNumber;

    ReverseAndSubtract(int inputNumber) {
        reversedNumber = 0;
        this.inputNumber = inputNumber;
        this.initialInputNumber = inputNumber;
    }

    void toReverse() {
        while (inputNumber != 0) {
            reversedNumber = reversedNumber * 10 + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }

        System.out.println("Now your input value reversed to - " + reversedNumber);
        System.out.println("Difference is " + (initialInputNumber - reversedNumber));
    }

}