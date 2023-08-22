package com.papercut.gatewaysOfHellUser.resources.impl;

import com.papercut.gatewaysOfHellUser.domain.User;
import com.papercut.gatewaysOfHellUser.resources.UserResource;
import com.papercut.gatewaysOfHellUser.services.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok().body(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }

    @Override
    public ResponseEntity<User> create(User user) {
        return ResponseEntity.ok().body(userService.create(user));
    }
}
