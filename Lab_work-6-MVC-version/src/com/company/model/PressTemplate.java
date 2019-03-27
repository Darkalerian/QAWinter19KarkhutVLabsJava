package com.company.model;

abstract class PressTemplate {
    private int id;
    private String name;
    private String author;
    private int year;
    private static int idCounter = 0;

    PressTemplate() {
        this.id = idCounter;
        this.name = "Empty";
        this.author = "Unknown author";
        this.year = 0;
        idCounter++;
    }

    PressTemplate(String name, String author, int year) {
        this();
        this.name = name;
        this.author = author;
        this.year = year;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    abstract String view();


}
