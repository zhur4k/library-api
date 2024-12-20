package com.library.libraryapi.dto.mapper;

import com.library.libraryapi.dto.BookUpdateDto;
import com.library.libraryapi.model.Book;

import java.util.function.Function;

public class BookUpdateDtoMapper implements Function<BookUpdateDto, Book> {
    @Override
    public Book apply(BookUpdateDto bookUpdateDto) {
        Book book = new Book();
        book.setTitle(bookUpdateDto.title());
        book.setAuthor(bookUpdateDto.author());
        book.setId(bookUpdateDto.id());
        return book;
    }
}
