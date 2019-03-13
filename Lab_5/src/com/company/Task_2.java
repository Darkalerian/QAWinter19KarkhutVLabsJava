package com.company;

import java.util.Arrays;

class Task_2 {

    int [] getOddElements(int [] array){
        int oddCount=0;
        int oddSum=0;
        int [] arrValues = new int [2];
        for (int i:array) {
            if (i%2!=0){
                oddCount++;
                oddSum+=i;
            }
        }
        arrValues[0]=oddCount;
        arrValues[1]=oddSum;

        return arrValues;
    }

    void printCountAndSum(int[] values){
        System.out.println("Your array has "+values[0]+" odd values");
        System.out.println("Sum arrays elements is: "+values[1]);
    }
}
