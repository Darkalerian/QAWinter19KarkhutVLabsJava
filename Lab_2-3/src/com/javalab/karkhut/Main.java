package com.javalab.karkhut;


//This class launches tasks from HomeWork_2
public class Main {

    public static void main(String[] args) {
        //This service class divides task in console.
        RowDivider divider = new RowDivider();

        //HomeWork_2. Task_1
        //Put into swap argument number two numbers you want to swap.
        divider.divideRows("HomeWork_2. Task_1");
        Swap swap = new Swap(5, 2);
        swap.swapTwoVariable();

        //HomeWork_2. Task_2
        //Put into rands argument number you want to reverse.
        divider.divideRows("HomeWork_2. Task_2");
        ReverseAndSubtract rands = new ReverseAndSubtract(12345678);
        rands.toReverse();

        //HomeWork_2. Task_3
        //Put into myConverter  weight in pounds you want to convert.
        divider.divideRows("HomeWork_2. Task_3");
        WeightConverter myConverter = new WeightConverter(123.213);
        myConverter.convertIntoKilograms();

        //HomeWork_2. Task_4
        //Put into myCalculator  Sum of deposit, Months of deposit and deposits interest to calculate your possible income.
        divider.divideRows("HomeWork_2. Task_4");
        DepositCalculator myCalculator = new DepositCalculator(1023, 6, 2);
        myCalculator.calculateDeposit();


        //HomeWork_3. Task_1
        //Put into TriangleHandler argument number from 1 to 5 to print needed triangle set.
        divider.divideRows("HomeWork_3. Task_1");
        TriangleHandler myDrawer = new TriangleHandler(1);
        myDrawer.drawChoosenTriangle();

    }
}
