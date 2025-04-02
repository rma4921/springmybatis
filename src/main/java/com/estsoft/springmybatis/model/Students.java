package com.estsoft.springmybatis.model;

import lombok.*;

// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
public class Students {
    private int id;
    private String name;
    private String address;
    private int age;

    public Students() {

    }
    public Students(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
