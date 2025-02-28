package com.revature.backend.entity;


import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserEntityListener {

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @PrePersist
    public void prePersist(User user) {
        if (user.getRole() == null) {
            user.setRole(Role.USER);
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
    }

    @PreUpdate
    public void preUpdate(User user) {
        if (user.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
    }


}
