package com.ischade.springboot.service;


import com.ischade.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void addUser(User user);
    void deleteUserById(int id);
    void updateUser(User user);
}