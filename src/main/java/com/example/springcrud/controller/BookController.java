package com.example.springcrud.controller;

import com.example.springcrud.entity.Book;
import com.example.springcrud.service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class BookController {

    @Autowired
    private BookServiceInterface service;

    @GetMapping("books")
    public List<Book> getAllBoks(){
        return service.getAllBooks();
    }

    @PostMapping("books")
    public Book saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PutMapping("books")
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("books/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }
}
