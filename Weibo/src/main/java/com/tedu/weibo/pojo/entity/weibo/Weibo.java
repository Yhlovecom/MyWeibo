package com.tedu.weibo.pojo.entity.weibo;

public class Weibo {//微博表数据的封装类
    private Integer id;
    private String content;
    private String created;//创建时间
    private String userId;//用户id(外键）

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Weibo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created='" + created + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
