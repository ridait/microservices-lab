package com.ridait.itbookratingandreviewservice.models;

import java.util.List;

public class UserRatingAndReview {

    private String userId;
    private List<RatingAndReview> ratings;

    public UserRatingAndReview(){

    }

    public UserRatingAndReview(String userId, List<RatingAndReview> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<RatingAndReview> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingAndReview> ratings) {
        this.ratings = ratings;
    }
}
