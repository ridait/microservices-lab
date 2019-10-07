package com.ridait.itbookcatalogservice.resources;

import com.ridait.itbookcatalogservice.models.ItBookItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class ItBookCatalogResource {

    @RequestMapping("/{userId}")
    public List<ItBookItem> getCatalog(@PathVariable String userId){
        return Collections.singletonList(
                new ItBookItem("Clean Code",
                        "Uncle Bob",
                        "clean code reference book",
                        4,
                        "Good book")
        );
    }
}
