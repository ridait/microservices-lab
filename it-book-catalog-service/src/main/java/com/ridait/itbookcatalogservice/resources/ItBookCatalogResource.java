package com.ridait.itbookcatalogservice.resources;

import com.ridait.itbookcatalogservice.models.ItBook;
import com.ridait.itbookcatalogservice.models.ItBookItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class ItBookCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<ItBookItem> getCatalog(@PathVariable String userId){
        //let catalog service call info service
        List<String> bookIds = Arrays.asList("123","456","789");

        return bookIds.stream()
                .map(bookId -> {
                    ItBook itBook = restTemplate.getForObject("http://localhost:8082/itbooks/"+bookId,ItBook.class);
                    return new ItBookItem(itBook.getTitle(),
                            itBook.getAuthor(),
                            itBook.getDescription(),
                            4,
                            "Good Book");
                })
                .collect(Collectors.toList());

    }
}
