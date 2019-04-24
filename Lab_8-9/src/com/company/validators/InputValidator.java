package com.company.validators;

import com.company.exceptions.InvalidAuthorNameException;
import com.company.exceptions.InvalidContainerSizeException;
import com.company.exceptions.InvalidPriceMultiplierException;
import com.company.exceptions.InvalidYearValueException;
import com.company.input.InputHandler;
import com.company.model.Book;
import com.company.view.DemoView;
import com.company.view.Messages;

import java.util.Calendar;


public class InputValidator {
    private static final int MIN_YEAR = 1848;

    public static int enterContainerSize(int inputSize) throws InvalidContainerSizeException {
        if (inputSize > 0) {
            return inputSize;
        }
        throw new InvalidContainerSizeException();
    }

    public static int enterYearForSearch(int year) throws InvalidYearValueException {
        if (year > MIN_YEAR && year < Calendar.getInstance().get(Calendar.YEAR)) {
            return year;
        }
        throw new InvalidYearValueException();
    }

    public static String enterAuthorForSearch(String inputAuthor) throws InvalidAuthorNameException {
        if (inputAuthor != null && !inputAuthor.equalsIgnoreCase("")) {
            return inputAuthor;
        }
        throw new InvalidAuthorNameException();
    }

    public static double enterPriceChanging(int inputMultiplier) throws InvalidPriceMultiplierException {
        DemoView.printStatic(Messages.PRICE_CHANGE);
        double multiplier = (double) inputMultiplier;
        if (multiplier > 0) {

            return multiplier / 100.0;
        }
        throw new InvalidPriceMultiplierException();
    }

    public static Book enterBooksFields() {
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
