package com.lcwd.user.service.impl;

import com.lcwd.user.service.entities.User;
import com.lcwd.user.service.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.repositories.UserRepository;
import com.lcwd.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID = " + userId));
    }

    @Override
    public void deleteUser(User user) {
        userRepository.findById(user.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID = " + user.getUserId()));
        userRepository.delete(user);
    }

    @Override
    public User updateUser(User oldUser, User newUser) {
        User existingUser = userRepository.findById(oldUser.getUserId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found with ID: " + oldUser.getUserId()));

        existingUser.setName(newUser.getName());
        existingUser.setEmail(newUser.getEmail());
        existingUser.setAbout(newUser.getAbout());

        return userRepository.save(existingUser);
    }
}
