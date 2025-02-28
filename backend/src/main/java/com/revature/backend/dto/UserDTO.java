package com.revature.backend.dto;

import com.revature.backend.entity.Role;
import lombok.*;

@Data
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String username;

    private String email;

    private String firstName;

    private String lastName;

    private Role role;

    private String password;
}
