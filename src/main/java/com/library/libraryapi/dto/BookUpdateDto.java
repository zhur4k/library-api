package com.library.libraryapi.dto;

import com.library.libraryapi.model.Author;

public record BookUpdateDto(
        Long id,
        String title,
        Author author
){
}
