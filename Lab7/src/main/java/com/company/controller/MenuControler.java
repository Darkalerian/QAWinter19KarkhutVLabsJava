package com.company.controller;

import com.company.model.*;
import com.company.view.ConsoleView;
import com.company.view.Messages;

import java.util.Arrays;

public class MenuControler {
    private Boolean isRunning = false;
    private Shape[] container = {new Circle("Blue", 12), new Circle("Green", 22), new Circle(25),
            new Triangle(12, 12, 13), new Triangle("Blue", 20, 12, 12),
            new Rectangle("Green", 10, 10), new Rectangle("Blue", 20, 20), new Rectangle(30, 30), new Rectangle("Yellow", 12, 15)};

    public void run() {
        while (!isRunning) {
            ConsoleView.print(Messages.MENU_ITEMS);
            int choice = InputHandler.inputInt();
            chooseMenuItem(choice);
        }

    }


    private void chooseMenuItem(int choice) {
        switch (choice) {
            case 0:
                quit();
                break;
            case 1:
                ConsoleView.print(Arrays.toString(container));
                break;
            case 2:
                ConsoleView.print(Messages.SUM_ALL);
                ConsoleView.print(AreaSumCalculator.calcAreaForAllTypes(container));
                break;
            case 3:
                ConsoleView.print(Messages.SUM_CIRCLE);
                ConsoleView.print(AreaSumCalculator.calcAreaByTypeCircle(container));
                break;
            case 4:
                ConsoleView.print(Messages.SUM_RECTANGLE);
                ConsoleView.print(AreaSumCalculator.calcAreaByTypeRectangle(container));
                break;
            case 5:
                ConsoleView.print(Messages.SUM_TRIANGLE);
                ConsoleView.print(AreaSumCalculator.calcAreaByTypeTriangle(container));
                break;

            case 6:
                Arrays.sort(container, new CompareShapeByArea());
                ConsoleView.print(Arrays.toString(container));
                break;

            case 7:
                Arrays.sort(container, new CompareShapeByColor());
                ConsoleView.print(Arrays.toString(container));
                break;

            default:
                ConsoleView.print(Messages.MENU_WRONG_ITEM_ERROR);

        }

    }

    private void quit() {
        isRunning = true;
    }


}
