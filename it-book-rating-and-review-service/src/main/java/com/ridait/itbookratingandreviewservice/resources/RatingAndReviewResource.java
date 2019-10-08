package com.ridait.itbookratingandreviewservice.resources;

import com.ridait.itbookratingandreviewservice.models.RatingAndReview;
import com.ridait.itbookratingandreviewservice.models.UserRatingAndReview;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingAndReviewResource {

    @RequestMapping("/users/{userId}")
    public UserRatingAndReview getRatingsAndReviews(@PathVariable String userId){

        List<RatingAndReview> ratings = Arrays.asList(
                new RatingAndReview("123",4,"Good book to read"),
                new RatingAndReview("456",3,"Boring")
        );

        return new UserRatingAndReview(userId,ratings);

    }
}
