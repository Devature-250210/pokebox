package com.revature.backend.dao;

import com.revature.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);

    Optional<User> findByEmail(String email);
    User findByUsernameOrEmail(String username, String email);
}
