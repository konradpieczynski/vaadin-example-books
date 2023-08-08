package com.books.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {

    private String title;
    private String author;
    private String publicationYear;
    private BookType type;
}
