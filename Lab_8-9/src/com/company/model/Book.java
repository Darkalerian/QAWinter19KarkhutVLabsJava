package com.company.model;

import java.io.Serializable;
import java.util.Objects;

public class Book extends PressTemplate implements Serializable {
    private String publisher;
    private int pages;
    private double price;


    public Book() {
        super();
        this.publisher = "Unknown";
        this.pages = 0;
        this.price = 0.00;

    }

    public Book(String author, String name, String publisher, int year, int pages, double price) {
        super(name, author, year);
        this.publisher = publisher;
        this.pages = pages;
        this.price = price;

    }

    public String getPublisher() {
        return publisher;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double multiplier) {
        this.price = (price * (multiplier));
    }

    public String toString() {
        return "| Id: " + this.getId() + "| Author: " + this.getAuthor() + "| Name: " + this.getName() + "| Year: " + this.getYear() + "| Publisher: "
                + this.getPublisher() + "| Pages: "
                + this.getPages() + "| Price: " + this.getPrice();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), publisher, pages, price);
    }
}
