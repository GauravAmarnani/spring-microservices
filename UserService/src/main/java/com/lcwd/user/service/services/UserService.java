package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //User Operations:

    //Create:
    User saveUser(User user);

    //Get All Users:
    List<User> getAllUsers();

    //Get User by UserId:
    User getUser(String userId);

    //Delete User:
    void deleteUser(User user);

    //Update User:
    User updateUser(User oldUser, User newUser);

}