package com.tedu.weibo.pojo.dto.user;

import lombok.Data;

@Data
public class UserRegDTO {//用于接收前端传递的用户注册表单数据
    private String userName;//用户名
    private String nickName;//昵称
    private String password;//密码
}
