package com.tedu.weibo.mapper.comment;

import com.tedu.weibo.pojo.entity.comment.Comment;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 表示这是一个mybatis的mapper类，通过外部文件配置，实现数据库操作
public interface CommentMapper {//评论表操作接口

    // 通过封装对象Comment添加评论
    int addComment(Comment comment);

    // 通过评论id删除评论
    int deleteComment(int id);
    // 通过评论id查询评论
    Comment findCommentById(int id);
    // 通过评论id更新评论
    int updateComment(Comment comment);

    // 通过微博id查询评论
    Comment[] findCommentByWeiboId(int weiboId);
    // 通过微博id删除评论
    int deleteCommentByWeiboId(int weiboId);

    // 通过用户id查询评论
    Comment[] findCommentByUserId(int userId);
    // 通过用户id删除评论
    int deleteCommentByUserId(int userId);
}
