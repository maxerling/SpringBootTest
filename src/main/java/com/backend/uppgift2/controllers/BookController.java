package com.backend.uppgift2.controllers;

import com.backend.uppgift2.models.Book;
import com.backend.uppgift2.models.Kompis;
import com.backend.uppgift2.repos.BookDAO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Max Erling
 * Date: 2021-04-08
 * Copyright: MIT
 * Class: Java20B
 */

@RestController
public class BookController {

    BookDAO db = new BookDAO();
    List<Book> mybooks = db.getAllBooks();

    @RequestMapping("/books")
    public List<Book> books() {
        return mybooks;
    }


    @PostMapping("/book/add")
    public String addBook(@RequestBody Book b) {
        mybooks.add(b);
        return "book added";
    }

    @PostMapping("/book/upsert")
    public String upsertBook(@RequestBody Book b) {
            int indexToUpdate = -1;

            for (int i = 0; i < mybooks.size();i++) {
                if (mybooks.get(i).getId() == b.getId()) {
                    indexToUpdate = i;
                }


        }

        if (indexToUpdate == -1) {
            mybooks.add(b);
        } else {
            mybooks.set(indexToUpdate,b);
        }
        return "book updated";
    }
}
