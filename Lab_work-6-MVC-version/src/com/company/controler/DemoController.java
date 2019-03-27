package com.company.controler;

import com.company.model.Book;
import com.company.model.Books;
import com.company.view.DemoView;
import com.company.view.Messages;


public class DemoController {
    private Books library;
    private Book book1 = new Book("Peter Wats", "Blindsight", "University press", 2001, 231, 12.5);
    private Book book2 = new Book("Lie Cixun", "Three body problem", "Bejing press", 2007, 432, 22.5);
    private DemoView view = new DemoView();
    private boolean done = false;


    public void run() {
        library = new Books(10);
        library.addItem(book1);
        library.addItem(book2);

        while (!done) {
            view.print(Messages.BOOKS_STATUS + library.getCount() + Messages.BOOKS_ITEMS + library.getContainer());
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
                DemoView.printStatic(Messages.CONTAINER_SIZE);
                library = new Books(InputValidator.enterContainerSize(InputHandler.inputInt()));
                break;
            case 2:
                view.print(library.showContainerElements());

                break;
            case 3:
                library.addItem(InputValidator.enterBooksFields());
                break;
            case 4:

                library.changePriceOfItems(InputValidator.enterPriceChanging(InputHandler.inputInt()));
                break;
            case 5:
                DemoView.printStatic(Messages.AUTHOR_INPUT);
                view.print(library.findItemByAuthor(InputValidator.enterAuthorForSearch(InputHandler
                        .inputLine())).showContainerElements());
                break;
            case 6:
                DemoView.printStatic(Messages.YEAR_INPUT);
                view.print(library.findItemAfterYear(InputValidator.enterYearForSearch(InputHandler
                        .inputInt())).showContainerElements());
                break;
            default:
                view.print(Messages.MENU_WRONG_ITEM_ERROR);

        }

    }

    void quit() {
        done = true;
    }


}
