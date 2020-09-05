package com.tao.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

//@MainBeantt()
public class AliasForTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AliasForTest.class);

        String[] beannames = context.getBeanNamesForType(AliasForTest.class);

        //当加上@AliasFor时, 输出"mainbean"
        //当去掉@AliasFor注解后, 输出"main"
        System.out.println(beannames[0]);

        context.close();
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@interface MainBeantt {

    @AliasFor("value")
    String beanName() default "";
    @AliasFor("beanName")
    String value() default "";
}
