package com.library.libraryapi.service;

import com.library.libraryapi.dto.BookCreateDto;
import com.library.libraryapi.dto.BookUpdateDto;
import com.library.libraryapi.dto.mapper.BookCreateDtoMapper;
import com.library.libraryapi.dto.mapper.BookUpdateDtoMapper;
import com.library.libraryapi.model.Book;
import com.library.libraryapi.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    private final BookCreateDtoMapper bookCreateDtoMapper;

    private final BookUpdateDtoMapper bookUpdateDtoMapper;

    public BookServiceImpl(BookRepository bookRepository, BookCreateDtoMapper bookCreateDtoMapper, BookUpdateDtoMapper bookUpdateDtoMapper) {
        this.bookRepository = bookRepository;
        this.bookCreateDtoMapper = bookCreateDtoMapper;
        this.bookUpdateDtoMapper = bookUpdateDtoMapper;
    }

    @Override
    public Page<Book> getAllBooks(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public void createBook(BookCreateDto book) {
        bookRepository.save(bookCreateDtoMapper.apply(book));
    }

    @Override
    public void updateBook(BookUpdateDto book) {
        bookRepository.save(bookUpdateDtoMapper.apply(book));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
