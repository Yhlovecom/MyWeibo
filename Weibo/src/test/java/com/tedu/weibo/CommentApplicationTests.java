package com.tedu.weibo;

import com.tedu.weibo.mapper.comment.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("com.tedu.weibo")
public class CommentApplicationTests {//评论相关功能测试类

    @Autowired // 自动注入，便于调用数据库的操作方法
    CommentMapper commentMapper;// 评论的mapper类，操作数据库中的comment表
}
