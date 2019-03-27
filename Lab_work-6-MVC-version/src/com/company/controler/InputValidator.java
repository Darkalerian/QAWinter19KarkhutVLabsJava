package com.company.controler;

import com.company.model.Book;
import com.company.view.DemoView;
import com.company.view.Messages;
import java.util.Calendar;


public class InputValidator {

    static int enterContainerSize(int inputSize) {


        if (inputSize > 0) {
            return inputSize;
        }
        return 0;
    }

    static int enterYearForSearch(int year) {

        final int MIN_YEAR = 1848;
        if (year > MIN_YEAR && year < Calendar.getInstance().get(Calendar.YEAR)) {
            return year;
        }
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    static String enterAuthorForSearch(String inputAuthor) {
        if (inputAuthor != null) {
            return inputAuthor;
        }
        return "Empty";
    }

    static double enterPriceChanging(int inputMultiplier) {
        DemoView.printStatic(Messages.PRICE_CHANGE);
        double multiplier = (double) inputMultiplier;
        if (multiplier > 0) {

            return multiplier / 100.0;
        }
        return 100.0;
    }

    static Book enterBooksFields() {
        InputHandler.clearScanner();
        DemoView.printStatic(Messages.BOOK_NAME_INPUT);
        String name = InputHandler.inputLine();
        DemoView.printStatic(Messages.AUTHOR_INPUT);
        String author = InputHandler.inputLine();
        DemoView.printStatic(Messages.YEAR_INPUT);
        int year = InputHandler.inputInt();
        InputHandler.clearScanner();
        DemoView.printStatic(Messages.PUBLISHER_INPUT);
        String publisher = InputHandler.inputLine();
        DemoView.printStatic(Messages.NUMBER_OF_PAGES_INPUT);
        int pages = InputHandler.inputInt();
        InputHandler.clearScanner();
        DemoView.printStatic(Messages.PRICE_INPUT);
        double price = InputHandler.inputDouble();
        return new Book(author, name, publisher, year, pages, price);
    }

    public static void containerIsFullError() {
        DemoView.printStatic(Messages.EMPTY_RESULT_ERROR);
    }


}
