package com.wyf.reflection;

import java.lang.annotation.ElementType;

/**
 * 所有类型的Class对象
 */
public class ReflectionTest03 {

    public static void main(String[] args) {
        // 类
        Class c1 = Object.class;
        // 接口
        Class c2 = Comparable.class;
        // 数组
        Class c3 = String[].class;
        // 二维数组
        Class c4 = int[][].class;
        // 注解
        Class c5 = Override.class;
        // 枚举
        Class<ElementType> elementTypeClass = ElementType.class;
        // 基本数据类型
        Class<Integer> integerClass = Integer.class;
        // void
        Class<Void> voidClass = void.class;
        // Class
        Class<Class> classClass = Class.class;

        System.out.println(c1);//class java.lang.Object
        System.out.println(c2);//interface java.lang.Comparable
        System.out.println(c3);//class [Ljava.lang.String;
        System.out.println(c4);//class [[I
        System.out.println(c5);//interface java.lang.Override
        System.out.println(elementTypeClass);//class java.lang.annotation.ElementType
        System.out.println(integerClass);//class java.lang.Integer
        System.out.println(voidClass);//void
        System.out.println(classClass);//class java.lang.Class
        //只要元素类型与维度一样就是一个class
    }
}
