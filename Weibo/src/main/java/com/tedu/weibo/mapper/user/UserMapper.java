package com.tedu.weibo.mapper.user;

import com.tedu.weibo.pojo.VO.user.UserVO01;
import com.tedu.weibo.pojo.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {// 用户表操作接口

    List<UserVO01> selectAllUsers();//查询所有用户
    User selectUser(User user);// 根据用户属性查询用户

    int updateUser(User user);//更改用户属性

    int addUser(User user);// 添加用户

    int deleteUser(User user);//按照ID删除用户

}
