package com.sros.webflux.model;

public class Book {
    private String id;
    private String author;
    private String title;

    public Book() {
    }

    public Book(String id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
