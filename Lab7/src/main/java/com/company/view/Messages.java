package com.company.view;

public interface Messages {

    String MENU_ITEMS = "Enter number of menu item: " +
            "\n 0 - Quit" +
            "| 1 - Show container items" +
            "| 2 - Show sum of all figures" +
            "| 3 - Show sum of all Circles" +
            "\n| 4 - Show sum of all Rectangles" +
            "| 5 - Show sum of all Triangles" +
            "| 6 - Sort shapes by area" +
            "| 7 - Sort shapes by color";

    String SUM_ALL = "Sum of all figures: ";
    String SUM_TRIANGLE = "Sum of all triangles: ";
    String SUM_CIRCLE = "Sum of all circles: ";
    String SUM_RECTANGLE = "Sum of all rectangles: ";

    String MENU_WRONG_ITEM_ERROR = "Wrong menu item";
    String INTEGER_INPUT = "\n Enter integer value ";
    String DOUBLE_INPUT = "\n Enter double value ";
}
