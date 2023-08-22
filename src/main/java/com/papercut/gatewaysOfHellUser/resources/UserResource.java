package com.papercut.gatewaysOfHellUser.resources;

import com.papercut.gatewaysOfHellUser.domain.User;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserResource {

    @GetMapping(value = "/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping()
    ResponseEntity<List<User>> findAll();

    @PostMapping("/create")
    ResponseEntity<User> create(@RequestBody User user);
}
