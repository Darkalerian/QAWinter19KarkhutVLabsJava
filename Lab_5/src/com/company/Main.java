package com.company;

public class Main {

    public static void main(String[] args) {
        //Creating task instances
        Task_1 task1 = new Task_1();
        Task_2 task2 = new Task_2();
        Task_3 task3 = new Task_3();
        Task_4 task4 = new Task_4();
        Task_5_extra task5 = new Task_5_extra();
        Task_6_extra task6 = new Task_6_extra();
        Task_7_extra task7 = new Task_7_extra();
        //Input handler instance creation
        InputHandler myHandler = new InputHandler();
        //Array builder instance creation
        ArrayBuilder builder = new ArrayBuilder();

        chooseTask(myHandler, builder, task1, task2, task3, task4, task5, task6, task7);// This method invokes Task methods


    }

    static void startTask_1(ArrayBuilder builder1, Task_1 task1) {
        int[] task1Array = builder1.getArray();
        task1Array = task1.reverseArray(task1Array);
        task1.printArrayByForeachloop(task1Array);
    }

    static void startTask_2(ArrayBuilder builder1, Task_2 task2) {
        int[] task2Array = builder1.getArray();
        task2.printCountAndSum(task2.getOddElements(task2Array));
    }

    static void startTask_3(ArrayBuilder builder1, Task_3 task3, InputHandler myHandler) {
        int arraysSize = myHandler.writeArraySize();
        int[] taskArray1 = builder1.getArray(arraysSize);
        int[] taskArray2 = builder1.getArray(arraysSize);
        int[] resultedArray = task3.getSummOfArraysElements(taskArray1, taskArray2);
        task3.printResultedArray(resultedArray);
    }

    static void startTask_4(ArrayBuilder builder1, Task_4 task4, InputHandler myHandler) {
        int arraysSize = myHandler.writeArraySize();
        int minValue = myHandler.writeMinValue();
        int maxValue = myHandler.writeMaxValue();
        int[] task4Array1 = builder1.getArray(arraysSize, minValue, maxValue);
        task4.printArrays(task4.splitAarraysToPositiveNegative(task4Array1));

    }

    static void startTask_5(ArrayBuilder builder1, Task_5_extra task5, InputHandler myHandler) {
        int[] task5Array1 = builder1.getArray();
        task5.printAverageAndCount(task5.calculateAverageValue(task5Array1),
                task5.calculateBiggerValues(task5.calculateAverageValue(task5Array1), task5Array1));
    }

    static void startTask_6(ArrayBuilder builder1, Task_6_extra task6, InputHandler myHandler) {
        int[] task6Array1 = builder1.getArray();
        int[] task6Array2 = builder1.getArray();
        task6.printConcatArrays(task6.getConcatOfArrays(task6Array1, task6Array2));

    }

    static void startTask_7(ArrayBuilder builder1, Task_7_extra task7, InputHandler myHandler) {
        int[] task7Array1 = builder1.getArray();
        int min = task7.getMinValue(task7Array1);
        int max = task7.getMaxValue(task7Array1);
        task7Array1 = task7.deleteDuplicate(min, max, task7Array1);
        task7.printBoundaryValuesAndArray(min, max, task7Array1);

    }


    static void chooseTask(InputHandler myHandler, ArrayBuilder builder,
                           Task_1 task1, Task_2 task2, Task_3 task3, Task_4 task4, Task_5_extra task5,
                           Task_6_extra task6, Task_7_extra task7) {
        int numberOfTask = myHandler.writeTaskByNumber();
        if (numberOfTask < 1 || numberOfTask > 6) {
            System.out.println("Your value - incorrect. Default value changed to 1 ");
            return;
        }
        switch (numberOfTask) {
            case 1:
                startTask_1(builder, task1);
                break;
            case 2:
                startTask_2(builder, task2);
                break;
            case 3:
                startTask_3(builder, task3, myHandler);
                break;
            case 4:
                startTask_4(builder, task4, myHandler);
                break;
            case 5:
                startTask_5(builder, task5, myHandler);
                break;
            case 6:
                startTask_6(builder, task6, myHandler);
                break;
            case 7:
                startTask_7(builder, task7, myHandler);
                break;
            default:
                System.out.println("Incorrect task number");


        }

    }
}
