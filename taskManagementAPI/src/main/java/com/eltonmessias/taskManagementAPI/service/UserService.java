package com.eltonmessias.taskManagementAPI.service;

import com.eltonmessias.taskManagementAPI.model.User;
import com.eltonmessias.taskManagementAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User login(String username, String password) {
        User user = userRepository.findByUsername(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
