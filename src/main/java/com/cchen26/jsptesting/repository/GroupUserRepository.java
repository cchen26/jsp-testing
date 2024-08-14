package com.cchen26.jsptesting.repository;

import com.cchen26.jsptesting.model.GroupUser;

public interface GroupUserRepository {
    void save(GroupUser groupUser);
    Long validateLogin(String emailAddress, String password);
}
