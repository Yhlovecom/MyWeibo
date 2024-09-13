package com.tedu.weibo.pojo.entity.comment;

import lombok.Data;

@Data
public class Comment {//评论表数据的封装类
    private Integer id;//评论id
    private String content;//评论内容
    private String created;//评论创建时间
    private Integer userId;//用户id（外键）
    private Integer weiboId;//微博id（外键）
}
