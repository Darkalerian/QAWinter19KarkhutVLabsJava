package com.company.controler;

import com.company.view.DemoView;
import com.company.view.Messages;

import java.util.Scanner;

class InputHandler {
    static Scanner scanner = new Scanner(System.in);

    static int inputInt() {
        while (!InputHandler.scanner.hasNextInt()) {
            DemoView.printStatic(Messages.INTEGER_INPUT);
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    static double inputDouble() {
        while (!InputHandler.scanner.hasNextDouble()) {
            DemoView.printStatic(Messages.DOUBLE_INPUT);
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    static String inputLine() {
        while (!InputHandler.scanner.hasNextLine()) {
            DemoView.printStatic(Messages.DOUBLE_INPUT);
            scanner.nextLine();
        }
        return scanner.nextLine();

    }

    static void clearScanner() {
        scanner.nextLine();
    }


}
