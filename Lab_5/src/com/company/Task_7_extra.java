package com.company;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task_7_extra {

    int getMinValue(int[] array) {
        OptionalInt min2 = Arrays.stream(array).min();
        return min2.getAsInt();
    }

    int getMaxValue(int[] array) {
        OptionalInt max2 = Arrays.stream(array).min();
        return max2.getAsInt();
    }

    int[] deleteDuplicate(int min, int max, int[] array) {
        int[] resultedArray = null;
        int resultedArrayLengthCounter = 0;
        for (int i : array) {
            if (array[i] != min || array[i] != max) {
                resultedArrayLengthCounter++;
            }
        }
        resultedArray = new int[resultedArrayLengthCounter];
        resultedArray[0] = min;
        resultedArray[resultedArray.length-1] = max;

        for (int i = 1, j = 0; i < array.length-1; i++) {
            if (array[i] != min || array[i] != max) {
                resultedArray[i] = array[j];
                j++;
            }
        }

        return resultedArray;
    }

    void printBoundaryValuesAndArray(int min, int max, int[] array) {
        System.out.println("Your array now without duplicates:");
        System.out.println("Minimum value is: " + min + "Maximum value is: " + max);
    }
}
