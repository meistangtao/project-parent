package com.tao.springboot;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tao.springboot.mapper")
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
        //pp();
    }

    private  static void pp(){
        String kk="hbdhb";
        try {
            System.out.println("kk = " + kk);
            //return;
        }catch (Exception e){
            return;
        }finally {
            System.out.println("kk oooooooo= " + kk);
        }

        System.out.println("jjjjjjj");
    }

}
