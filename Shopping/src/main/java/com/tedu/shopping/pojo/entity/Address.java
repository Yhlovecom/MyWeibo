package com.tedu.shopping.pojo.entity;

public class Address {
    private int id;//地址表ID
    private String receiver;//收件人姓名
    private String address;//收货地址
    private String email;//收件人邮箱
    private String mobile;//收件人手机尾号
    private String tag;//地址标签

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", receiver='" + receiver + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
