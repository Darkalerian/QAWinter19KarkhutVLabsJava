package com.company.model;

import com.company.controler.InputValidator;
import com.company.view.DemoView;
import com.company.view.Messages;

public class Books {
    private Book[] container;
    private int count = 0;
    private int freeItemIndex;

    public Books(int containerSize) {
        this.container = new Book[containerSize];
        this.freeItemIndex = 0;
    }

    public Books(int containerSize, int freeItemIndex) {
        this.container = new Book[containerSize];
        this.freeItemIndex = freeItemIndex;
    }

    public int getCount() {
        return count;
    }

    public int getContainer() {
        return container.length;
    }

    public Boolean addItem() {
        if (count >= container.length) {
            DemoView.printStatic(Messages.CONTAINER_FULL_ERROR);
            return false;
        } else container[count++] = new Book();
        DemoView.printStatic(Messages.BOOK_ADDED);
        return true;
    }

    public Boolean addItem(Book book) {
        if (count >= container.length) {
            DemoView.printStatic(Messages.CONTAINER_FULL_ERROR);
            return false;
        } else container[count++] = book;
        DemoView.printStatic(Messages.BOOK_ADDED);
        return true;
    }


    public Boolean addItem(String author, String name, String publisher, int year, int pages, double price) {
        if (count >= container.length) {
            InputValidator.containerIsFullError();
            return false;
        } else container[count++] = new Book(author, name, publisher, year, pages, price);
        DemoView.printStatic(Messages.BOOK_ADDED);
        return true;
    }


    public String showContainerElements() {
        if (count == 0) {
            return "empty";
        }
        String result = "";
        for (Book book : this.container) {
            if (book == null) {
                continue;
            }
            result += book.view();
            result += "\n";
        }
        return result;
    }

    public void changePriceOfItems(double multiplier) {
        for (Book book : this.container) {
            if (book != null) {
                book.setPrice(multiplier);
            }
        }
//        for (int i =0; i<=count; i++){
//            container[i].setPrice(multiplier);
//        }

    }


    public Books findItemByAuthor(String sample) {

        Books result = new Books(count);

        for (int i = 0; i <= count; i++) {
            if (container[i] != null && container[i].getAuthor().toLowerCase().contains(sample.toLowerCase())) {
                result.addItem(container[i]);
            }
        }

        return result;
    }

    public Books findItemAfterYear(int year) {
        Books result = new Books(this.container.length);
        int j = 0;
        for (Book book : this.container) {
            if (book != null) {
                result.container[j] = book;
                j++;
            }
        }
        return result;
    }

}
