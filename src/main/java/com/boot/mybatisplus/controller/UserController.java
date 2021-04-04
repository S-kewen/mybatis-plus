package com.boot.mybatisplus.controller;


import com.boot.mybatisplus.result.MyResult;
import com.boot.mybatisplus.result.StatusCode;
import com.boot.mybatisplus.result.StatusMsg;
import com.boot.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author skwen
 * @since 2021-04-04
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    public MyResult list() {
        return new MyResult(StatusCode.OK, StatusMsg.OK, userService.list());
    }
}

