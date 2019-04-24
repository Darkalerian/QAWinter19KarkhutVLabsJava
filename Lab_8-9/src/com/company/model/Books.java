package com.company.model;

import com.company.validators.InputValidator;
import com.company.view.DemoView;
import com.company.view.Messages;

import java.util.Arrays;
import java.util.Comparator;

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

    public Book[] getContainer() {
        return container;
    }

    public int getContainerSize() {
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
        if (this.count == 0) {
            return "empty";
        }
        String result = "";
        for (Book book : this.container) {
            if (book == null) {
                continue;
            }
            result += book;
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

    }


    public Books findItemByAuthor(String sample) {

        Books result = new Books(count);

        for (Book book : this.container) {
            if (book != null && book.getAuthor().toLowerCase().contains(sample.toLowerCase())) {
                result.addItem(book);
            }
        }

        return result;
    }

    public Books findItemAfterYear(int year) {
        Books result = new Books(this.container.length);
        int j = 0;

        for (Book book : this.container) {
            if (book != null && book.getYear() > year) {
                result.addItem(book);
                j++;
            }
        }
        return result;
    }


    public Books sortByAuthor() {
        Books result = new Books(this.container.length);
        result.container = Arrays.copyOf(container, count);
        Arrays.sort(result.container, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        result.count = this.count;
        return result;
    }

    public Books sortByPublisher() {
        Books result = new Books(this.container.length);
        result.container = Arrays.copyOf(container, count);
        Arrays.sort(result.container, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });
        result.count = this.count;
        return result;
    }

    public Books sortByPrice() {
        Books result = new Books(this.container.length);
        result.container = Arrays.copyOf(container, count);
        Arrays.sort(result.container, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                }
                return 0;
            }
        });
        result.count = this.count;
        return result;
    }

}
