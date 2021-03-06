package com.book.service;

import com.book.entity.Book;
import com.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceInterface {

    @Autowired
    private BookRepository bookRespository;

    @Override
    public List<Book> getAllBooks() {
        return bookRespository.findAll();
    }

    @Override
    public Book saveBook(Book book) {
        return bookRespository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return bookRespository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRespository.deleteById(id);
    }
}
