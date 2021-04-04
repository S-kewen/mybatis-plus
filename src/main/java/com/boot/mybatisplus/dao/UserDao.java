package com.boot.mybatisplus.dao;

import com.boot.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author skwen
 * @since 2021-04-04
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}
