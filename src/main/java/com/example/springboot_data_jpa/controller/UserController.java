package com.example.springboot_data_jpa.controller;

import com.example.springboot_data_jpa.bean.User;
import com.example.springboot_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("user/getById/{id}")
    public User get(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @PostMapping("user/insert")
    public User insert(@RequestBody User user) {
        User user1 = userRepository.save(user);
        return user1;
    }
}
