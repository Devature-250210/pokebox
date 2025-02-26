package com.revature.backend.dto;

import com.revature.backend.entity.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Set;
import java.util.UUID;

public class UserDTO {

    private UUID id;

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private Set<Role> roles;
}
