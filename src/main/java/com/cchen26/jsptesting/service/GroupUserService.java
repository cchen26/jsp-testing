package com.cchen26.jsptesting.service;

import com.cchen26.jsptesting.model.GroupUser;

public interface GroupUserService {
    void registerUser(GroupUser user);
    GroupUser loginUser(String emailAddress, String password);
    //User getUserById(int userId);
    //User getUserByUsername(String username);
}