package com.tedu.weibo.mapper.weibo;

import com.tedu.weibo.pojo.entity.weibo.Weibo;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 表示这是一个mybatis的mapper类，通过外部文件配置，实现数据库操作
public interface WeiboMapper {//微博表操作接口
    // 通过封装对象Weibo添加微博
    int addWeibo(Weibo weibo);

    // 通过微博id删除微博
    int deleteWeibo(int id);
    // 通过微博id查询微博
    Weibo findWeiboById(int id);
    // 通过微博id更新微博
    int updateWeibo(Weibo weibo);

}
