package com.ridait.itbookinfoservice.models;

public class ItBook {

    private String bookId;
    private String title;
    private String author;
    private String description;

    public ItBook(String bookId,String title, String author, String description) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
