package com.tao.springboot.bean;

import lombok.Getter;
import lombok.Setter;
import reactor.util.annotation.NonNull;

@Setter
@Getter
public class SysRoles {
    private Integer id;

    @NonNull
    private String role;

    private String description;

    private Integer available;


}