package com.wyf.annotation;

import java.lang.annotation.*;

/**
 * 测试元注解
 */
@MyAnnotation
public class TestAnnotation02 {

    @MyAnnotation
    public void test() {

    }
}

//定义一个注解
//Target 表示注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//Retention表示我们的注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)
//表示是否将我们的注解生成在文档中
@Documented
//Inherited子类可以继承父类的注解
@Inherited
@interface MyAnnotation {

}