package com.kurininc.testservice.service;

import com.kurininc.testservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1, "John", "Smith", 20));
        users.add(new User(2, "Jack", "Brown", 25));
        users.add(new User(3, "Zack", "Black", 40));
    }

    public List<User> getUsers() {
        return users;
    }
}
