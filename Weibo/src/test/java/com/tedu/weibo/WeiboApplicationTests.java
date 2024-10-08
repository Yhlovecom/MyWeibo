package com.tedu.weibo;

import com.tedu.weibo.mapper.comment.CommentMapper;
import com.tedu.weibo.mapper.weibo.WeiboMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan("com.tedu.weibo")
class WeiboApplicationTests {

    @Autowired
    WeiboMapper weiboMapper;// 微博的mapper类，操作数据库中的weibo表

    @Test
    void contextLoads() {
    }

}
