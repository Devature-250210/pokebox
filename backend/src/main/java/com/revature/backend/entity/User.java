package com.revature.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(UserEntityListener.class)
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Role role;
}
