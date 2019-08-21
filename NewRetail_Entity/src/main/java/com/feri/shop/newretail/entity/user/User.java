package com.feri.shop.newretail.entity.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;


@Data
public class User {
    private Integer id;
    private String phone;
    @JsonIgnore //转换为json的时候忽略该字段
    private String password;
    private Short flag;


}
