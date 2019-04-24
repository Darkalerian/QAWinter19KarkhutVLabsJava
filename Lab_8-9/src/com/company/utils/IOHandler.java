package com.company.utils;

import com.company.model.Book;
import com.company.model.Books;

import java.io.*;

public class IOHandler {
    public static final String PATH = ".\\src\\resources\\";

    public static void writeBookToFile(Book book) throws IOException {
        File file = new File
                (PATH + book.getAuthor() + "-" + book.getName() + ".ser");
        try (ObjectOutputStream outputStream = new ObjectOutputStream
                (new FileOutputStream(file))) {
            outputStream.writeObject(book);

        }

    }

    public static void writeBookToFile(Book book, File folder) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream
                (new FileOutputStream(folder))) {
            outputStream.writeObject(book);

        }

    }


    public static Book readBookFromFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(PATH + fileName);
        try (ObjectInputStream outputStream = new ObjectInputStream
                (new FileInputStream(file))) {
            return (Book) outputStream.readObject();
        }
    }

    public static void initBooksFromFile(Books books) throws IOException, ClassNotFoundException {
        File folder = new File(PATH);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file == null) {
                continue;
            }
            if (file.getName().endsWith(".ser")) {
                System.out.println(file.getName());
                books.addItem(readBookFromFile(file.getName()));
            }
        }

    }

    public static void saveBooksToFile(Books books) throws IOException {
        for (Book book : books.getContainer()) {
            if (book == null) {
                continue;
            }
            writeBookToFile(book);
        }
    }

    public static void saveCurrentSet(Books books) throws IOException {
        File folder = new File(PATH + "SearchResult-" + books.hashCode());
        folder.mkdir();
        for (Book book : books.getContainer()) {
            if (book == null) {
                continue;
            }
            writeBookToFile(book, folder);
        }
    }
}