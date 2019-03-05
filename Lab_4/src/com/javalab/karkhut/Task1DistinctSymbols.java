package com.javalab.karkhut;

import java.util.Scanner;

public class Task1DistinctSymbols {


    public static void main(String[] args) {

        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phrase");
        String inputValue = scanner.nextLine();
        System.out.println("Distinct symbols from your phrase:");
        System.out.println(getDistinctSymbols(inputValue));

        //Task 2
        Task2IntToBit task = new Task2IntToBit();
        System.out.println("Enter your int value");
        String my2 = task.getByteRepresentation(scanner.nextInt());
        System.out.println("Binary version: " + my2);


    }

    private static char[] getDistinctSymbols(String inputValue) {
        char[] input = inputValue.toCharArray();
        //This variable contains array of distinct char symbols
        char[] distinct = new char[input.length];

        //This loop adds every distinct char elements into 'distinct' array
        for (char i = 0; i < input.length; i++) {
            if (contains(distinct, input[i])) {
                distinct[i] = input[i];
            }
        }

        return distinct;
    }

    //This method will return false if element has a duplicate in distinct array
    private static boolean contains(char[] arr, char target) {
        for (char i : arr) {
            if (i == target)
                return false;
        }
        return true;
    }

}
