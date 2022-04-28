package com.book.service;

import com.book.entity.Book;

import java.util.List;

public interface BookServiceInterface {

    List<Book> getAllBooks();

    Book saveBook(Book book);

    Book updateBook(Book book);

    void deleteBook(Long id);
}
