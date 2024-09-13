package com.tedu.weibo.pojo.dto.user;

import lombok.Data;

@Data
public class UserUpdateDTO {
    private Integer id;
    private String nickName;
    private String password;
    private String newPassword;
}
