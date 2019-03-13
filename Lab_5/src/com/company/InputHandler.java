package com.company;

import java.util.Scanner;

class InputHandler {
    private Scanner myscanner = new Scanner(System.in);

    int writeTaskByNumber() {
        System.out.println("Enter number of task, you want to start(from 1 to 7): ");
        return myscanner.nextInt();
    }

    int writeArraySize() {
        System.out.println("Enter size of your array: ");
        return myscanner.nextInt();
    }

    int writeMinValue() {
        System.out.println("Enter min value of your array: ");
        return myscanner.nextInt();
    }

    int writeMaxValue() {
        System.out.println("Enter max value of your array: ");
        return myscanner.nextInt();
    }

}
