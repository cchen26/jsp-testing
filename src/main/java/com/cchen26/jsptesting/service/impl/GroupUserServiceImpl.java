package com.cchen26.jsptesting.service.impl;

import com.cchen26.jsptesting.model.GroupUser;
import com.cchen26.jsptesting.model.User;
import com.cchen26.jsptesting.repository.GroupUserRepository;
import com.cchen26.jsptesting.service.GroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupUserServiceImpl implements GroupUserService {
    private final GroupUserRepository groupUserRepository;

    @Autowired
    public GroupUserServiceImpl(GroupUserRepository groupUserRepository) {
        this.groupUserRepository = groupUserRepository;
    }

    @Override
    public void registerUser(GroupUser user) {

    }

    @Override
    public GroupUser loginUser(String emailAddress, String password) {
        Long customerGroupId = groupUserRepository.validateLogin(emailAddress, password);
        if (customerGroupId != null) {
            return new GroupUser.GroupUserBuilder()
                    .custGrpId(customerGroupId)
                    .build();
        }
        return null;
    }
}
