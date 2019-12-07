package com.tellhow.swagger.service;

import com.tellhow.swagger.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findUserById(int id);

    int saveUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
