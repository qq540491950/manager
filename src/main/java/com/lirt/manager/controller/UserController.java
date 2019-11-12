package com.lirt.manager.controller;

import com.github.pagehelper.PageInfo;
import com.lirt.manager.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api("人员接口")
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取全部人员信息", notes = "人员信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "数量", defaultValue = "10")
    })
    @GetMapping("user")
    public PageInfo findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {

        return new PageInfo(userService.findAll(pageNum, pageSize));
    }
}
