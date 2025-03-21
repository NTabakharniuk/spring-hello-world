package com.example.springhelloworld.service;

import com.example.springhelloworld.model.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = Arrays.asList(
            new User(1L, "Іван", "ivan@example.com"),
            new User(2L, "Марія", "maria@example.com"),
            new User(3L, "Петро", "petro@example.com")
    );

    public List<User> getAllUsers() {
        return users;
    }
}
