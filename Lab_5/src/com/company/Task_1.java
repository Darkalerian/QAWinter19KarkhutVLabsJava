package com.company;

class Task_1 {

    int [] reverseArray(int [] array){
        if (array==null)  {
            System.out.println("Array is null");
            return null;}

        int [] array2 = new int[array.length];
        for (int i=0, j =1;i<array.length;i++, j++){
             array2[i] = array[array.length-j];
        }
        System.out.println("Your array was reversed to: ");

       return array2;
    }

    void printArrayByForeachloop(int [] array){
        if (array==null)  {
            System.out.println("Array is null");
            return;}



        System.out.print("[ ");
            for (int i: array){
                System.out.print(i+" ");
            }
            System.out.println("]");
    }

}
