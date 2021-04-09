package com.backend.uppgift2.repos;

import com.backend.uppgift2.models.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-08
 * Copyright: MIT
 * Class: Java20B
 */
public class BookDAO {


    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1,"eat","shit"));
        books.add(new Book(2,"hagen","nutz"));

        return books;
    }
}
