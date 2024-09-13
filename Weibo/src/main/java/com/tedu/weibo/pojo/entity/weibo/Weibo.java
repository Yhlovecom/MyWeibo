package com.tedu.weibo.pojo.entity.weibo;

import lombok.Data;

@Data
public class Weibo {//微博表数据的封装类
    private Integer id;
    private String content;
    private String created;//创建时间
    private String userId;//用户id(外键）
}
