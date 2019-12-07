package com.tellhow.swagger.controller;

import com.tellhow.swagger.entity.User;
import com.tellhow.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@RestController
@Api()
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("user")
    @ApiOperation(value = "获取所有用户信息", notes = "所有用户信息")
    public List<User> users() {
        return userService.findAll();
    }

    @GetMapping("user/{id}")
    @ApiOperation(value = "通过id获取用户信息", notes = "通过用户ID获取用户信息")
    @ApiImplicitParam(value = "id", name = "用户id", required = true)
    public User findUserById(@PathVariable("id") int id) {
        return userService.findUserById(id);
    }

    @PostMapping("user")
    @ApiOperation(value = "增加用户", notes = "增加用户信息")
    @ApiImplicitParam(name = "用户信息", dataTypeClass = User.class)
    public String saveUser(@RequestBody User user) {
        return userService.saveUser(user) > 0 ? "增加成功" : "增加失败";
    }

    @PutMapping("user")
    @ApiOperation(value = "更新用户信息", notes = "更新用户信息")
    @ApiImplicitParam(name = "用户信息", dataTypeClass = User.class)
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user) > 0 ? "更新成功" : "更新失败";
    }

    @DeleteMapping("user/{id}")
    @ApiOperation(value = "删除用户", notes = "删除用户")
    @ApiImplicitParam(name = "id", value = "id")
    public String deleteUser(@PathVariable("id") int id) {
        return userService.deleteUser(id) > 0 ? "删除成功" : "删除失败";
    }

    @RequestMapping("test")
    @ApiIgnore(value = "测试方法")
    public String test() {
        return "测试方法!";
    }
}
