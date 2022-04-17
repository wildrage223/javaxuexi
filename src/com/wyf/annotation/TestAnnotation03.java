package com.wyf.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
public class TestAnnotation03 {

    //注解可以显示的赋值，如果没有默认值，我们就必须赋值给注解
    @MyAnnotation2(name = "wyf",schools = {"理工大学"})
    public void test() {

    }

    @MyAnnotation3("1111")
    public void test1() {

    }
}


@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    //注解的参数：参数类型+参数名()
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在。

    String[] schools();
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3 {
    String value();
}
