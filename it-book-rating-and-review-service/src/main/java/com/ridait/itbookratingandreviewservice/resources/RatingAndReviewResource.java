package com.ridait.itbookratingandreviewservice.resources;

import com.ridait.itbookratingandreviewservice.models.RatingAndReview;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingAndReviewResource {

    @RequestMapping("/{itBookId}")
    public List<RatingAndReview> getRatingsAndReviews(@PathVariable String itBookId){

        return Collections.singletonList(
                new RatingAndReview(itBookId,4,"Good book to read")
        );

    }
}
