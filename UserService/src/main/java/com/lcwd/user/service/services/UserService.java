package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //User Operations:

    //Create:
    User create(User user);

    //Get All Users:
    List<User> getAll();

    //Get User by UserId:
    User get(String userId);

}