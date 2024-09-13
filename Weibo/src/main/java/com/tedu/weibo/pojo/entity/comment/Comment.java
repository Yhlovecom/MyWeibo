package com.tedu.weibo.pojo.entity.comment;

public class Comment {//评论表数据的封装类
    private Integer id;//评论id
    private String content;//评论内容
    private String created;//评论创建时间
    private Integer userId;//用户id（外键）
    private Integer weiboId;//微博id（外键）

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Integer weiboId) {
        this.weiboId = weiboId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created='" + created + '\'' +
                ", userId=" + userId +
                ", weiboId=" + weiboId +
                '}';
    }
}
