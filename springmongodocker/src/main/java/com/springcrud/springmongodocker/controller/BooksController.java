package com.springcrud.springmongodocker.controller;


import com.springcrud.springmongodocker.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.springcrud.springmongodocker.repository.BookRepo;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BooksController {
    @Autowired
    private BookRepo repository;

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return repository.findAll();
    }

}
