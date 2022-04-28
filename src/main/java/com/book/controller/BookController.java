package com.book.controller;

import com.book.service.BookServiceInterface;
import com.book.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @Autowired
    private BookServiceInterface service;

    @GetMapping()
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping()
    public Book saveBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PutMapping()
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
        service.deleteBook(id);
    }
}
