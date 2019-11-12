package com.lirt.manager.service;

import com.lirt.manager.entity.User;
import java.util.List;

public interface UserService {

    List<User> findAll(int pageNum, int pageSize);

}
