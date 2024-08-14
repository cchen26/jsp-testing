package com.cchen26.jsptesting.service;

import com.cchen26.jsptesting.model.User;

public interface UserService {
    void registerUser(User user);
    User loginUser(String username, String password);
    User getUserById(int userId);
    User getUserByUsername(String username);
}