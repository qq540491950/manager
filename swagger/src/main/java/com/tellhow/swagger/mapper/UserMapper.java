package com.tellhow.swagger.mapper;

import com.tellhow.swagger.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    List<User> findAll();

    User findUserById(int id);

    int saveUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
