package com.example.solrtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;


@SpringBootApplication
public class SolrTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolrTestApplication.class, args);
    }

}
