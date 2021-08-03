package com.kurininc.testservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
@AllArgsConstructor
@Getter
@ToString
public class Student {

    private String id;
    private String name;
    private Gender gender;
    private int grade;

    public enum Gender {
        MALE, FEMALE
    }
}
