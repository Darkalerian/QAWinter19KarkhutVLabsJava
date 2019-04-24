package com.company.view;

public interface Messages {
    String MENU_ITEMS = "Enter number of menu item: " +
            "\n 0 - Quit" +
            "| 1 - Create new container" +
            "| 2 - Show books" +
            "| 3 - Create book" +
            "| 4 - Change price of books" +
            "\n| 5 - Find book by Author" +
            "| 6 - Find book after exact year" +
            "| 7 - Sort by author"+
            "| 8 - Sort by publisher"+
            "| 9 - Sort by price";


    String MENU_WRONG_ITEM_ERROR = "Wrong menu item!";
    String BOOKS_STATUS = "Your current library contains: ";
    String BOOKS_ITEMS = " elements of maximum size: ";

    String CONTAINER_SIZE = "\n Enter container size: ";
    String YEAR_INPUT = "\n Enter year";
    String AUTHOR_INPUT = "\n Enter author name: ";
    String EMPTY_RESULT_ERROR = "\n Result is empty";
    String PRICE_CHANGE = "\n Enter percents for changing (more than 100 to increase price, less - to decrease) : ";
    String CONTAINER_FULL_ERROR = "\n Your container is full";
    String BOOK_ADDED = " New book was added ";
    String SAVE_BOOKS = "\n To save results - print 1 ";


    //Book creating messages
    String BOOK_NAME_INPUT = "\n Enter book's name: ";
    String PUBLISHER_INPUT = "\n Enter Publisher: ";
    String NUMBER_OF_PAGES_INPUT = "\n Enter number of pages: ";
    String PRICE_INPUT = "\n Enter price: ";

    String INTEGER_INPUT = "\n Enter integer value ";
    String DOUBLE_INPUT = "\n Enter double value ";

}
