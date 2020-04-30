package com.firstservice.user.controller;

import com.firstservice.user.repository.User;
import com.firstservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/users")
    public List<User> get() {
        return userService.get();
    }

    @PatchMapping("/users")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @DeleteMapping("/users")
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }

    @GetMapping("/users/{username}/company/{company}")
    public User validateClient(@PathVariable String username, @PathVariable String company) {
        return userService.validateClient(username, company);
    }


}
