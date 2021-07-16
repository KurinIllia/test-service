package com.kurininc.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "books")
@AllArgsConstructor
@Getter
@ToString
public class Book {

    @Id
    private String id;

    private String name;

    private String author;

    @Field(type = FieldType.Date, format = DateFormat.date)
    private String date;

}
