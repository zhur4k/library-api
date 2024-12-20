package com.library.libraryapi.controller;

import com.library.libraryapi.dto.BookCreateDto;
import com.library.libraryapi.dto.BookUpdateDto;
import com.library.libraryapi.model.Book;
import com.library.libraryapi.service.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public Page<Book> getAllBooks(Pageable pageable) {
        return bookService.getAllBooks(pageable);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateBook(@RequestBody BookUpdateDto book) {
        bookService.updateBook(book);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping("/create")
    public ResponseEntity<?> createBook(@RequestBody BookCreateDto book) {
        bookService.createBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteBook(@RequestParam Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
