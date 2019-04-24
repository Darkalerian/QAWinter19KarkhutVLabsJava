package com.company.input;

import com.company.view.DemoView;
import com.company.view.Messages;

import java.util.Scanner;

public class InputHandler {
    public static Scanner scanner = new Scanner(System.in);

    public static int inputInt() {
        while (!InputHandler.scanner.hasNextInt()) {
            DemoView.printStatic(Messages.INTEGER_INPUT);
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static double inputDouble() {
        while (!InputHandler.scanner.hasNextDouble()) {
            DemoView.printStatic(Messages.DOUBLE_INPUT);
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    public static String inputLine() {
        while (!InputHandler.scanner.hasNextLine()) {
            DemoView.printStatic(Messages.MENU_WRONG_ITEM_ERROR);
            scanner.nextLine();
        }
        return scanner.nextLine();

    }

    public static void clearScanner() {
        scanner.nextLine();
    }


}
