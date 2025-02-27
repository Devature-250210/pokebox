package com.revature.backend.controller;

import com.revature.backend.dto.UserDTO;
import com.revature.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Page<UserDTO> getUsers(@RequestParam int page, @RequestParam int size) {
        return userService.getAllUsers(page, size);
    }
}
