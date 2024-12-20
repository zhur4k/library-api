package com.library.libraryapi.dto.mapper;

import com.library.libraryapi.dto.BookCreateDto;
import com.library.libraryapi.model.Book;

import java.util.function.Function;

public class BookCreateDtoMapper implements Function<BookCreateDto, Book> {
    @Override
    public Book apply(BookCreateDto bookCreateDto) {
        Book book = new Book();
        book.setTitle(bookCreateDto.title());
        book.setAuthor(bookCreateDto.author());
        return book;
    }
}
