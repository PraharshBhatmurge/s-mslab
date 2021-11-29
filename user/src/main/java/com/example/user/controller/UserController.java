package com.example.user.controller;


import com.example.user.VO.ResponseTemplateVO;
import com.example.user.entity.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithVisa(@PathVariable("id") Long userId) {
        return userService.getUserWithVisa(userId);
    }

    @GetMapping("/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{userId}")
    public String deleteBook(@PathVariable("userId") Long userId) {
        userService.delete(userId);
        return "User Deleted";
    }
}