package com.revature.backend.controller;

import com.revature.backend.dto.UserDTO;
import com.revature.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public Page<UserDTO> getUsers(@RequestParam int page, @RequestParam int size) {
        return userService.getAllUsers(page, size);
    }

    @PostMapping("/save")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.created(null).body(userService.saveUser(userDTO));
    }

//    @GetMapping("/{userId}")
//    public UserDTO getUser(@PathVariable UUID userId) {
//        return userService.getUser(userId);
//    }
}
