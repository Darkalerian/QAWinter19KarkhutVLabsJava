package com.company.controler;

import java.util.Scanner;

import com.company.entities.Book;
import com.company.container.Books;
import com.company.view.OutputHandler;

public class AppControler {

    private boolean done = false;
    private Scanner scanner = new Scanner(System.in);

    //Default library
    private Books library;
    private Book book1 = new Book("Peter Wats", "Blindsight", "University press", 2001, 231, 12.5);
    private Book book2 = new Book("Lie Cixun", "Three body problem", "Bejing press", 2007, 432, 22.5);


    public void run() {
        library = new Books(5);
        library.addItem(book1);
        library.addItem(book2);

        while (!done) {
            OutputHandler.printMenu();
            int choice = scanner.nextInt();
            chooseMenuItem(choice);
        }
        scanner.close();
    }

    private void chooseMenuItem(int choice) {
        switch (choice) {
            case 0:
                quit();
                break;
            case 1:
                library = new Books(OutputHandler.enterContainerSize(scanner));
                break;
            case 2:
                library.showContainerElements();
                break;
            case 3:
                library.addItem(OutputHandler.enterBooksFields(scanner));
                break;
            case 4:
                library.changePriceOfItems(OutputHandler.enterPriceChanging(scanner));
                break;
            case 5:
                library.findItemByAuthor(OutputHandler.enterAuthorForSearch(scanner))
                        .showContainerElements();
                break;
            case 6:
                library.findItemAfterYear(OutputHandler.enterYearForSearch(scanner)).showContainerElements();
                break;
            default:
                System.out.println("Wrong menu item!");

        }

    }

    void quit() {
        done = true;
    }


}
