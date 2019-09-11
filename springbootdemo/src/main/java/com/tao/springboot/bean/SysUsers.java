package com.tao.springboot.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SysUsers {
    private Integer id;

    private String username;

    private String password;

    private String salt;

    private Integer locked;

}