package com.company.controller;

import com.company.model.Circle;
import com.company.model.Rectangle;
import com.company.model.Shape;
import com.company.model.Triangle;
import com.company.view.ConsoleView;
import com.company.view.Messages;

import java.util.Arrays;

public class MenuControler {
    Boolean isRunning = false;
    Shape[] container = {new Circle(12), new Circle(22), new Circle(25),
            new Triangle(12, 12, 13), new Triangle(20, 12, 12),
            new Rectangle(10, 10), new Rectangle(20, 20), new Rectangle(30, 30), new Rectangle(12, 15)};

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
                ConsoleView.print(calcArea(container));
                break;
            case 3:
                ConsoleView.print(Messages.SUM_CIRCLE);
                ConsoleView.print(calcAreaByTypeCircle(container));
                break;
            case 4:
                ConsoleView.print(Messages.SUM_RECTANGLE);
                ConsoleView.print(calcAreaByTypeRectangle(container));
                break;
            case 5:
                ConsoleView.print(Messages.SUM_TRIANGLE);
                ConsoleView.print(calcAreaByTypeTriangle(container));
                break;

            default:
                ConsoleView.print(Messages.MENU_WRONG_ITEM_ERROR);

        }

    }

    void quit() {
        isRunning = true;
    }


    double calcArea(Shape[] array) {
        double result = 0;
        for (Shape index : array) {
            result += index.calcArea();
        }
        return result;
    }

    double calcAreaByTypeCircle(Shape[] shapes) {
        double sum = 0.0;
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

    double calcAreaByTypeTriangle(Shape[] shapes) {
        double sum = 0.0;
        for (Shape s : shapes) {
            if (s instanceof Triangle) {
                sum += s.calcArea();
            }
        }
        return sum;
    }

    double calcAreaByTypeRectangle(Shape[] shapes) {
        double sum = 0.0;
        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                sum += s.calcArea();
            }
        }
        return sum;
    }
}
