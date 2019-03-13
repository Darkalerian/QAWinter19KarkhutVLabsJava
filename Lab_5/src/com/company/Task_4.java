package com.company;

class Task_4 {

    int[][] splitAarraysToPositiveNegative(int[] array) {
        int[] positive;
        int[] negative;
        int positiveCounter = 0;
        int negativeCounter = 0;

        for (int i : array) {
            if (i > 0) {
                positiveCounter++;
            } else if (i < 0) {
                negativeCounter++;
            }
        }

        positive = new int[positiveCounter];
        negative = new int[negativeCounter];
        int j = 0;
        int z = 0;
        for (int i : array) {
            if (i > 0) {
                positive[j] = i;
                j++;
            } else if (i < 0) {
                negative[z] = i;
                z++;
            }
        }
        int[][] myArray = {positive, negative};
        return myArray;
    }

    void printArrays(int[][] array) {
        Task_1 printer = new Task_1();
        System.out.print("Now your resulted array with positive values contains next elements: ");
        printer.printArrayByForeachloop(array[0]);
        System.out.print("Now your resulted array with negative values contains next elements: ");
        printer.printArrayByForeachloop(array[1]);
    }
}
