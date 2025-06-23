package com.eartrainer.eartrainer.service;

import com.eartrainer.eartrainer.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserService userService;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AuthService(UserService userService) {
        this.userService = userService;
    }

    public void register(String username, String password) {
        String hashedPassword = encoder.encode(password);
        User user = new User();
        user.setUsername(username);
        user.setPassword(hashedPassword);
        userService.saveUser(user);
    }

    public boolean login(String username, String password) {
        User user = userService.getUserByUsername(username);

        if (user == null) {
            return false;
        }

        return encoder.matches(password, user.getPassword());
    }

    public BCryptPasswordEncoder getEncoder() {
        return encoder;
    }
}
