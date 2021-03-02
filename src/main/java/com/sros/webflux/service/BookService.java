package com.sros.webflux.service;

import com.sros.webflux.model.Book;
import com.sros.webflux.repos.BookRepos;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    private BookRepos bookRepos;

    public BookService(BookRepos bookRepos) {
        this.bookRepos = bookRepos;
    }


    public Mono<Book> getBook() {
        return Mono.just(this.bookRepos.getBook());
    }
}
