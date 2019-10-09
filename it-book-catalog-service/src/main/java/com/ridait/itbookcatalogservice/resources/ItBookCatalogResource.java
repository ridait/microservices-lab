package com.ridait.itbookcatalogservice.resources;

import com.ridait.itbookcatalogservice.models.ItBook;
import com.ridait.itbookcatalogservice.models.ItBookItem;
import com.ridait.itbookcatalogservice.models.UserRatingAndReview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class ItBookCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;

    @RequestMapping("/{userId}")
    public List<ItBookItem> getCatalog(@PathVariable String userId){

        //let catalog service call rating & info services
        UserRatingAndReview userRatingAndReview =
                restTemplate.getForObject("http://it-book-rating-and-review-service/ratings/users/"+userId,UserRatingAndReview.class);
        return userRatingAndReview.getRatings().stream()
                .map(ratingAndReview -> {
                    ItBook itBook = restTemplate.getForObject(
                            "http://it-book-info-service/itbooks/"+ratingAndReview.getBookId(),
                            ItBook.class);
                    return new ItBookItem(itBook.getTitle(),
                            itBook.getAuthor(),
                            itBook.getDescription(),
                            ratingAndReview.getRating(),
                            ratingAndReview.getReview());
                })
                .collect(Collectors.toList());

    }
}
/* ItBook itBook = webClientBuilder.build()
                            .get()
                            .uri("http://localhost:8082/itbooks/"+bookId)
                            .retrieve()
                            .bodyToMono(ItBook.class)
                            .block();*/