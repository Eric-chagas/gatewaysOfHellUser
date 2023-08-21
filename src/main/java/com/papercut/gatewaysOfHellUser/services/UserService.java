package com.papercut.gatewaysOfHellUser.services;

import com.papercut.gatewaysOfHellUser.domain.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
}
