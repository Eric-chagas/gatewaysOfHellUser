package com.papercut.gatewaysOfHellUser.services.impl;

import com.papercut.gatewaysOfHellUser.domain.User;
import com.papercut.gatewaysOfHellUser.repositories.UserRepository;
import com.papercut.gatewaysOfHellUser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}
