package com.feri.shop.newretail.msg.model;

import lombok.Data;

/**
 * @program: NewRetail
 * @description:
 * @author: Feri
 * @create: 2019-08-13 14:54
 */
@Data
public class VCode {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String phone;

    public VCode() {
    }

    public VCode(int code, String phone) {
        this.code = code;
        this.phone = phone;
    }
}
