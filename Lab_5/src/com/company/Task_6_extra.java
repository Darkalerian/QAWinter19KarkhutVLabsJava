package com.company;

class Task_6_extra {

    int[] getConcatOfArrays(int[] arr1, int[] arr2) {
        int[] arrResulted = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrResulted[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrResulted[arr1.length + i] = arr2[i];
        }
        return arrResulted;

    }

    void printConcatArrays(int[] array) {
        Task_1 printer = new Task_1();
        System.out.print("Now your resulted array contains elements from 2 arrays: ");
        printer.printArrayByForeachloop(array);

    }
}
