package com.javalab.karkhut;

//This class contains basic templates for building complex figures
class TemplateDrawer {
    private TemplateDrawer() {
    }

    //this method prints row of "*" starting from 1 and +1 "*" each iteration

    static void printStars(int i) {
        int j = 0;
        while (j < i) {
            System.out.print("* ");
            j++;
        }
    }

    //this method prints row of "_" starting from 1 and +1 "_" each iteration

    static void printSpaces(int i) {
        int j = 10;
        while (j > i) {
            System.out.print("  ");
            j--;
        }
    }


}
