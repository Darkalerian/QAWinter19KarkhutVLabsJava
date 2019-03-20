package com.company.entities;

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
        this.id = idCounter;
        this.name = name;
        this.author = author;
        this.year = year;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    abstract void view();


}
