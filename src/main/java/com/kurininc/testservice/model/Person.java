package com.kurininc.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
@AllArgsConstructor
@Getter
@ToString
public class Person {

    @Id
    private final String id;

    @Column
    private final String name;

    @Column
    private final int age;
}
