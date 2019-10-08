package com.ridait.itbookcatalogservice.models;

public class RatingAndReview {

    private String bookId;
    private int rating;
    private String review;

    public RatingAndReview(){

    }

    public RatingAndReview(String bookId, int rating, String review) {
        this.bookId = bookId;
        this.rating = rating;
        this.review = review;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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
