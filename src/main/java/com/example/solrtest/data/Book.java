package com.example.solrtest.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import javax.annotation.processing.Generated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "book")
public class Book {

    @Id
    //@Indexed(name = "id", type = "long")
    @Field
    private Long id;
    //@Indexed(name = "title", type = "string")
    @Field
    private String title;
    //@Indexed(name = "author", type = "string")
    @Field
    private String author;

}
