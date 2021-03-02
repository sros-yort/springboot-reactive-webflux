package com.sros.webflux.repos;

import com.sros.webflux.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepos {
    public Book getBook() {
        return new Book("1", "Spring Boot Reactive", "Sros");
    }
}
