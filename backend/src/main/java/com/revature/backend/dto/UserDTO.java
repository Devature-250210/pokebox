package com.revature.backend.dto;

import com.revature.backend.entity.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HexFormat;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
public class UserDTO {

    private UUID id;

    private String username;
    private String displayName;
    private String nameColor;
    private String email;
    private String firstName;
    private String lastName;
    private Set<Role> roles;
}
