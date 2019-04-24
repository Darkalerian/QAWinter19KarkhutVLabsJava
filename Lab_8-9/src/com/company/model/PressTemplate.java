package com.company.model;

import java.io.Serializable;
import java.util.Objects;

abstract class PressTemplate implements Serializable {
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "PressTemplate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PressTemplate that = (PressTemplate) o;
        return id == that.id &&
                year == that.year &&
                name.equals(that.name) &&
                author.equals(that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, year);
    }
}
