package com.company;

class Task_5_extra {

    int calculateAverageValue(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;

    }

    int calculateBiggerValues(int average, int[] array) {
        int counterBiggerValues = 0;
        for (int i : array) {
            if (i > average) {
                counterBiggerValues++;
            }
        }
        return counterBiggerValues;
    }

    void printAverageAndCount(int average, int count) {
        System.out.println("Average value of your array is: " + average);
        System.out.println(count + " values is bigger than average value");
    }
}
