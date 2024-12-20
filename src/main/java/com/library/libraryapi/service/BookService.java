package com.library.libraryapi.service;

import com.library.libraryapi.dto.BookCreateDto;
import com.library.libraryapi.dto.BookUpdateDto;
import com.library.libraryapi.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Page<Book> getAllBooks(Pageable pageable);

    void createBook(BookCreateDto book);

    void updateBook(BookUpdateDto book);

    void deleteBook(Long id);
}
