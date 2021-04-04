package com.boot.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.boot.mybatisplus.dao.UserDao;
import com.boot.mybatisplus.entity.User;
import com.boot.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author skwen
 * @since 2021-04-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
    @Autowired
    private UserDao dao;
}
