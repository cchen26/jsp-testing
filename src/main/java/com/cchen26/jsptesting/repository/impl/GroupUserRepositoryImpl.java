package com.cchen26.jsptesting.repository.impl;

import com.cchen26.jsptesting.model.GroupUser;
import com.cchen26.jsptesting.repository.GroupUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class GroupUserRepositoryImpl implements GroupUserRepository {


    @Override
    public void save(GroupUser groupUser) {
        //implementation to save a GroupUser to the DB
    }

    @Override
    public Long validateLogin(String emailAddress, String password) {
        try {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //other methods
}
