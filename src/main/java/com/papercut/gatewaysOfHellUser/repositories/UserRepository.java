package com.papercut.gatewaysOfHellUser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.papercut.gatewaysOfHellUser.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { }
