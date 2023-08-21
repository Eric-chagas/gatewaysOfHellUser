package com.papercut.gatewaysOfHellUser.domain;

import lombok.*;
import static lombok.EqualsAndHashCode.Include;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "USERS")
public class User {

    @Include
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String name;
    @Include
    private String email;
    private String password;
    private String nickname;
    private int age;
    private double store_credit;
}
