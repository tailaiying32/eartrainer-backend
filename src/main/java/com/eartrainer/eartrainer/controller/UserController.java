package com.eartrainer.eartrainer.controller;


import com.eartrainer.eartrainer.model.User;
import com.eartrainer.eartrainer.service.AuthService;
import com.eartrainer.eartrainer.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class UserController {

    private final UserService userService;
    private final AuthService authService;

    public UserController(UserService userService) {
        this.userService = userService;
        this.authService = new AuthService(userService);
    }

    @PostMapping("register")
    public User register(String username, String password) {
        try {
            authService.register(username, password);
            return userService.getUserByUsername(username);
        } catch (Exception e) {
            return null;
        }
    }

    @PostMapping("login")
    public boolean login(String username, String password) {
        return authService.login(username, password);
    }
}
