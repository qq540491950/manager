package com.lirt.manager.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.lirt.manager.entity.User;
import com.lirt.manager.mapper.UserMapper;
import com.lirt.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
//    @Cacheable(value = "user")
    public List<User> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.findAll();
    }
}
