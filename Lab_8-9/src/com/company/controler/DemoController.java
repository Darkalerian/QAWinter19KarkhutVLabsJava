package com.company.controler;

import com.company.exceptions.InvalidAuthorNameException;
import com.company.exceptions.InvalidContainerSizeException;
import com.company.exceptions.InvalidPriceMultiplierException;
import com.company.exceptions.InvalidYearValueException;
import com.company.input.InputHandler;
import com.company.model.Books;
import com.company.utils.IOHandler;
import com.company.validators.InputValidator;
import com.company.view.DemoView;
import com.company.view.Messages;

import java.io.IOException;


public class DemoController {
    private Books library;
   // private Book book1 = new Book("Peter Wats", "Blindsight", "University press", 2001, 231, 12.5);
    //private Book book2 = new Book("Lie Cixun", "Three body problem", "Bejing press", 2007, 432, 22.5);
    private DemoView view = new DemoView();
    private int counter =0;
    private boolean done = false;


    public void run() {
        library = new Books(10);

        try {
            IOHandler.initBooksFromFile(this.library);
        } catch (IOException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }


        //library.addItem(book1);
        //library.addItem(book2);

        while (!done) {
            view.print(Messages.BOOKS_STATUS + library.getCount() + Messages.BOOKS_ITEMS + library.getContainerSize());
            view.print(Messages.MENU_ITEMS);
            int choice = InputHandler.inputInt();
            chooseMenuItem(choice);
        }
        InputHandler.scanner.close();

    }


    private void chooseMenuItem(int choice) {
        switch (choice) {
            case 0:
                quit();
                break;
            case 1:

                call1stMenuItem(counter);
                break;
            case 2:
                view.print(library.showContainerElements());
                break;
            case 3:
                library.addItem(InputValidator.enterBooksFields());
                break;
            case 4:
                call4MenuItem();
                break;
            case 5:
                call5MenuItem();
                break;
            case 6:
                call6MenuItem();
                break;

            case 7:
                Books resultAuthor = library.sortByAuthor();
                view.print(resultAuthor.showContainerElements());
                saveOrDiscardChanges(resultAuthor);
                break;

            case 8:
                Books resultPublisher = library.sortByPublisher();
                view.print(resultPublisher.showContainerElements());
                saveOrDiscardChanges(resultPublisher);
                break;

            case 9:
                view.print(library.sortByPrice().showContainerElements());
                break;

            default:
                view.print(Messages.MENU_WRONG_ITEM_ERROR);

        }

    }

    private void quit() {
        try {
            IOHandler.saveBooksToFile(this.library);
        } catch (IOException e) {
            e.printStackTrace();
        }

        done = true;
    }

   private void saveOrDiscardChanges(Books resultSet) {
        view.print(Messages.SAVE_BOOKS);
        int choice2 = InputHandler.inputInt();
        if (choice2 == 1) {
            try {
                IOHandler.saveCurrentSet(resultSet);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void call1stMenuItem(int counter) {

        DemoView.printStatic(Messages.CONTAINER_SIZE);
        try {
            if (counter>10){quit();}
            library = new Books(InputValidator.enterContainerSize(InputHandler.inputInt()));
        } catch (InvalidContainerSizeException e) {
            e.getMessage();
            call1stMenuItem(this.counter++);
        }
        this.counter=0;
    }

    private void call4MenuItem() {

        try {
            library.changePriceOfItems(InputValidator.enterPriceChanging(InputHandler.inputInt()));
        } catch (InvalidPriceMultiplierException e) {
            e.getMessage();
            call4MenuItem();
        }
    }

    private void call5MenuItem() {
        InputHandler.clearScanner();
        DemoView.printStatic(Messages.AUTHOR_INPUT);
        try {
            Books temp = library.findItemByAuthor((InputValidator.enterAuthorForSearch(InputHandler
                    .inputLine())));
            view.print(library.findItemByAuthor(InputValidator.enterAuthorForSearch(InputHandler
                    .inputLine())).showContainerElements());
            saveOrDiscardChanges(temp);
        } catch (InvalidAuthorNameException e) {
            e.getMessage();
            call5MenuItem();
        }
    }

    private void call6MenuItem() {
        DemoView.printStatic(Messages.YEAR_INPUT);
        try {
            view.print(library.findItemAfterYear(InputValidator.enterYearForSearch(InputHandler
                    .inputInt())).showContainerElements());
        } catch (InvalidYearValueException e) {
            e.getMessage();
            call6MenuItem();
        }
    }

}
