package com.library.libraryapi.dto;

import com.library.libraryapi.model.Author;

public record BookCreateDto (
        String title,
        Author author
){
}
