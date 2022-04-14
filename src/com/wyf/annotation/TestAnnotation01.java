package com.wyf.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * 什么事注解
 */
@SuppressWarnings("all")
public class TestAnnotation01 extends Object{

    @Override //重写的注解
    public String toString() {
        return super.toString();
    }

    // 不推荐使用，但可以使用，或者存在更好的方式
    @Deprecated
    public static void test() {
        System.out.println("Deprecated");
    }

    // 镇压警告
//    @SuppressWarnings("all")
    public void test02() {
        List<String> list = new ArrayList<>();
    }

    public static void main(String[] args) {
        test();
    }
}
