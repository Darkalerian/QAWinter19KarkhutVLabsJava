package com.company;

class Task_3 {

    int[] getSummOfArraysElements(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return null;
        }
        int[] arrResulted = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arrResulted[i] = arr1[i] + arr2[i];
        }
        return arrResulted;

    }

    void printResultedArray(int[] array) {
        Task_1 printer = new Task_1();
        System.out.print("Now your resulted array contains sum of elements: ");
        printer.printArrayByForeachloop(array);
    }
}
