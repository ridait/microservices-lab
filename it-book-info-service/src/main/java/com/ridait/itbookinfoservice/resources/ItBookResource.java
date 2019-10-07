package com.ridait.itbookinfoservice.resources;


import com.ridait.itbookinfoservice.models.ItBook;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itbooks")
public class ItBookResource {

    @RequestMapping("/{bookId}")
    public ItBook getItBook(@PathVariable String bookId){
        return new ItBook(bookId,"Clean Code","Uncle Bob","clean code reference book");
    }


}
