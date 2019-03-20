package com.company.container;

import com.company.entities.Book;
import com.company.view.OutputHandler;

public class Books {
    private Book[] container;
    private int containerSize;
    private int freeItemIndex;

    public Books(int containerSize) {
        this.containerSize = containerSize;
        this.container = new Book[containerSize];
        this.freeItemIndex = 0;
    }

    public Books(int containerSize, int freeItemIndex) {
        this.containerSize = containerSize;
        this.container = new Book[containerSize];
        this.freeItemIndex = freeItemIndex;
    }

    public void addItem() {
        if (freeItemIndex < containerSize) {
            container[freeItemIndex] = new Book();
            freeItemIndex++;
        } else OutputHandler.containerIsFullError();
    }

    public void addItem(Book book) {
        if (freeItemIndex < containerSize) {
            container[freeItemIndex] = book;
            freeItemIndex++;
        } else OutputHandler.containerIsFullError();
    }


    public void addItem(String author, String name, String publisher, int year, int pages, double price) {
        if (freeItemIndex < containerSize) {
            container[freeItemIndex] = new Book(author, name, publisher, year, pages, price);
            freeItemIndex++;
        } else OutputHandler.containerIsFullError();
    }


    public void showContainerElements() {
        for (Book book : this.container) {
            if (book == null) {
                continue;
            }
            book.view();
        }
    }

    public void changePriceOfItems(double multiplier) {
        for (Book book : this.container) {
            if (book != null) {
                book.setPrice(book.getPrice() * multiplier);
            }
        }
    }


    public Books findItemByAuthor(String sample) {
        Books result = new Books(this.containerSize);
        int j = 0;
        for (Book book : this.container) {
            if (book != null && book.getAuthor().toLowerCase().contains(sample.toLowerCase())) {
                result.container[j] = book;
                j++;
            }
        }
        return result;
    }

    public Books findItemAfterYear(int year) {
        Books result = new Books(this.containerSize);
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
