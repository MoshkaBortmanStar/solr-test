package com.example.solrtest.controller;

import com.example.solrtest.data.Book;
import com.example.solrtest.repository.BookSolarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookSolrController {
    private final BookSolarRepository bookSolarRepository;

    private static final List<Book> BOOKS = Arrays.asList(new Book(1L, "Vernon", "The Island"),
            new Book(2L, "Vernon", "Mars"),
            new Book(3L, "Vernon", "Diving"));

    @PostConstruct
    public void init() {
        bookSolarRepository.saveAll(BOOKS);
    }


    @GetMapping("/findAll")
    public List<Book> findAll() {
        return bookSolarRepository.findAllBy();
    }

    @GetMapping("/findByName/{title}")
    public Book findByTitle(@PathVariable("title") String title) {
        return bookSolarRepository.findByTitle(title);
    }


    @PreDestroy
    public void destroy() {
        bookSolarRepository.deleteAll(BOOKS);
    }



}
