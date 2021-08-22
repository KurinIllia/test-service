package com.kurininc.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class User {

    private final int id;

    private final String name;

    private final String surname;

    private final int age;
}
