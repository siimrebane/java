package ee.bcs.java.demo.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController()
@Validated
public class BookController {


    @GetMapping("book")
    public String test(){
        return "test";
    }

    @PostMapping("book")
    public Book saveBook(@Valid @RequestBody Book book) {
        return book;
    }

}
