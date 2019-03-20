package com.company.entities;

public class Book extends PressTemplate {
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {
        System.out.println("| Id: " + this.getId() + "| Author: " + this.getAuthor() + "| Name: " + this.getName() + "| Year: " + this.getYear() + "| Publisher: "
                + this.getPublisher() + "| Pages: " + this.getPages() + "| Price: " + this.getPrice());
    }

}
