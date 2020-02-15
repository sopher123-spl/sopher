package com.itjbit.domain;

import java.io.Serializable;

public class Address implements Serializable {
    private String addressName;
    private Integer addressNum;

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Integer getAddressNum() {
        return addressNum;
    }

    public void setAddressNum(Integer addressNum) {
        this.addressNum = addressNum;
    }
}
