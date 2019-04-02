package com.company.controller;

import com.company.view.ConsoleView;
import com.company.view.Messages;

import java.util.Scanner;

class InputHandler {

    private static Scanner scanner = new Scanner(System.in);

    static int inputInt() {
        while (!InputHandler.scanner.hasNextInt()) {
            ConsoleView.print(Messages.INTEGER_INPUT);
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    static double inputDouble() {
        while (!InputHandler.scanner.hasNextDouble()) {
            ConsoleView.print(Messages.DOUBLE_INPUT);
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    static String inputLine() {
        while (!InputHandler.scanner.hasNextLine()) {
            ConsoleView.print(Messages.MENU_WRONG_ITEM_ERROR);
            scanner.nextLine();
        }
        return scanner.nextLine();

    }

    static void clearScanner() {
        scanner.nextLine();
    }

}
