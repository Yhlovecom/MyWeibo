package com.tedu.weibo.mapper.user;

import com.tedu.weibo.pojo.VO.user.UserVO01;
import com.tedu.weibo.pojo.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {// 用户表操作接口
    User selectUserByUsername(User user);
    int addUser(User user);// 添加用户
    List<UserVO01> selectAllUsers();//查询所有用户
}
