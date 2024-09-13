package com.tedu.weibo.pojo.entity.user;

import lombok.Data;
import java.util.Date;

@Data/* 自动生成getter和setter方法以及toString*/
public class User {//用户表数据的封装类
    private String id;
    private String userName;
    private String nickName;
    private String password;
    private Date created;
}
