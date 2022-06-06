package com.example.solrtest.repository;

import com.example.solrtest.data.Book;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface BookSolarRepository extends SolrCrudRepository<Book, Long> {

    Book findByTitle(String title);

    List<Book> findByAuthor(String author);

    List<Book> findAllBy();

}
