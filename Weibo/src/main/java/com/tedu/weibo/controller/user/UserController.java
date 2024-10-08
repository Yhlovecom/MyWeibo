package com.tedu.weibo.controller.user;

import com.tedu.weibo.mapper.user.UserMapper;
import com.tedu.weibo.pojo.VO.user.UserVO01;
import com.tedu.weibo.pojo.dto.user.UserLoginDTO;
import com.tedu.weibo.pojo.dto.user.UserRegDTO;
import com.tedu.weibo.pojo.dto.user.UserUpdateDTO;
import com.tedu.weibo.pojo.entity.user.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {//用户数据库相关操作的控制器
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    public String login(@RequestBody UserLoginDTO userLoginDTO) {
        User user = new User();
        BeanUtils.copyProperties(userLoginDTO, user);
        //判断用户是否存在
        return userMapper.selectUser(user) != null ? "登录成功" : "用户不存在";
    }
    @GetMapping("/selectAllUser")//使用Get
    public List<UserVO01> selectAllUser(){
        try {
            return userMapper.selectAllUsers();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/updateUser")//更改用户信息
    public String updateUser(@RequestBody UserUpdateDTO userUpdateDTO) {
        if (null == userUpdateDTO.getId()){
            return "用户id为空";
        }

        User user = new User();
        BeanUtils.copyProperties(userUpdateDTO, user);

        if (userMapper.selectUser(user) == null) {
            return "用户不存在";
        }

        return userMapper.updateUser(user) > 0 ? "修改成功" : "修改失败";
    }

    @PostMapping("/reg")//用户注册的请求路径
    public String addUser(@RequestBody UserRegDTO userRegDTO) {
        if (userRegDTO.getPassword() == null ||
                userRegDTO.getUserName().trim()/*去除空格*/.isEmpty() /*判断是否为空值（且不为空格）*/||
                userRegDTO.getNickName().trim().isEmpty()) {return "用户名或密码为空";}

        User user = new User();
        BeanUtils.copyProperties(userRegDTO, user);
        if(userMapper.selectUser(user) != null){//判断用户是否存在
            return "用户已存在";
        }
        user.setCreated(new Date());
        return userMapper.addUser(user) > 0 ? "注册成功" : "注册失败";
    }

    @PostMapping("/deleteUserById/{id}")//用户注销
    public String deleteUserById(@PathVariable("id") int id){
        User user = new User();
        user.setId(id);
        if (userMapper.selectUser(user) == null){
            return "用户不存在";
        }
        return userMapper.deleteUser(user) > 0 ? "注销成功" : "注销失败";
    }
}
