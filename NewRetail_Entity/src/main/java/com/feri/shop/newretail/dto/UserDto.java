package com.feri.shop.newretail.dto;

import lombok.Data;


@Data
public class UserDto {
    private String phone;
    private String pass;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "phone='" + phone + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
