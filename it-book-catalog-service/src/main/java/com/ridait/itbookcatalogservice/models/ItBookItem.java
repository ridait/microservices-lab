package com.ridait.itbookcatalogservice.models;

public class ItBookItem {

    private String title;
    private String author;
    private String description;
    private int rating;
    private String review;

    public ItBookItem(String title, String author, String description, int rating, String review) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.rating = rating;
        this.review = review;
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
