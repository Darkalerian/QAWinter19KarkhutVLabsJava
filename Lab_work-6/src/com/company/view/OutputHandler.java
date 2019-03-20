package com.company.view;

import com.company.entities.Book;

import java.util.Calendar;
import java.util.Scanner;

public class OutputHandler {


    public static void printMenu() {
        System.out.println("Enter number of menu item: " +
                "\n 0 - Quit" +
                "\n 1 - Create new container" +
                "\n 2 - Show books" +
                "\n 3 - Create book" +
                "\n 4 - Change price of books" +
                "\n 5 - Find book by Author" +
                "\n 6 - Find book after exact year");
    }

    public static int enterContainerSize(Scanner scanner) {
        System.out.println("Enter container size: ");
        int size = scanner.nextInt();
        if (size > 0) {
            return size;
        }
        return 0;
    }

    public static int enterYearForSearch(Scanner scanner) {
        System.out.println("Enter year for search: ");
        final int MIN_YEAR = 1848;
        int year = scanner.nextInt();
        if (year > MIN_YEAR && year < Calendar.getInstance().get(Calendar.YEAR)) {
            return year;
        }
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static String enterAuthorForSearch(Scanner scanner) {

        System.out.println("Enter author name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name != null) {
            return name;
        }
        return "Empty";
    }

    public static double enterPriceChanging(Scanner scanner) {
        System.out.println("Enter percents for changing (more than 100 to increase price, less - to decrease) : ");
        double multiplier = scanner.nextDouble();
        if (multiplier > 0) {

            return multiplier / 100.0;
        }
        return 100.0;
    }

    public static Book enterBooksFields(Scanner scanner) {

        System.out.println("Name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Author: ");
        String author = scanner.nextLine();
        System.out.println("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Pages: ");
        int pages = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();
        return new Book(author, name, publisher, year, pages, price);
    }

    public static void containerIsFullError() {
        System.out.println("Your container is full");
    }

}
