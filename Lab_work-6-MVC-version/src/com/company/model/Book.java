package com.company.model;

public class Book extends PressTemplate {
    private String publisher;
    private int pages;
    private double price;


    Book() {
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

    private String getPublisher() {
        return publisher;
    }

    private int getPages() {
        return pages;
    }

    double getPrice() {
        return price;
    }


    public String view() {
        System.out.println();
        return "| Id: " + this.getId() + "| Author: " + this.getAuthor() + "| Name: " + this.getName() + "| Year: " + this.getYear() + "| Publisher: "
                + this.getPublisher() + "| Pages: "
                + this.getPages() + "| Price: " + this.getPrice();
    }

    public void setPrice(double multiplier) {
        this.price = (price * (multiplier));
    }


}
