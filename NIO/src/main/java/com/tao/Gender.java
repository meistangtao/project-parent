package com.tao;

public enum Gender {
//    MALE,FAMALE;
//    public String name;
    MALE("男"),FAMALE("女");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
