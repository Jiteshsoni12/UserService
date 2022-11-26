package com.lcwd.user.service.service;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {

    //Create User
    User saveUser(User user);

   //All user
    List<User> getAllUser();

    //single user
    User getUser(String userId);


}
