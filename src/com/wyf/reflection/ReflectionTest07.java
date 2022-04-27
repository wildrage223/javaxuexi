package com.wyf.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 获得类的信息
 */
public class ReflectionTest07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("com.wyf.reflection.User");

//        User user = new User();
//        c1 = user.getClass();

        // 获得类的名字
        System.out.println(c1.getName());  // 包名+类名
        System.out.println(c1.getSimpleName()); // 获得类名

        // 获得类的属性
        Field[] fields = c1.getFields(); //只能找到public属性

        fields = c1.getDeclaredFields(); // 能找到全部的属性
        for(Field field: fields) {
            System.out.println(field);
            //private java.lang.String com.wyf.reflection.User.name
            //private int com.wyf.reflection.User.id
            //private int com.wyf.reflection.User.age
        }

        // 获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);//private java.lang.String com.wyf.reflection.User.name

        // 获得类的方法
        Method[] methods = c1.getMethods(); // 获得本类及其父类的所有public方法
        for (Method method: methods) {
            System.out.println("正常的：" + method);
        }
        methods = c1.getDeclaredMethods(); // 获得本类的方法
        for (Method method: methods) {
            System.out.println("getDeclaredMethods：" + method);
        }

        // 获得指定方法
        // 重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName); //public java.lang.String com.wyf.reflection.User.getName()
        System.out.println(setName); //public void com.wyf.reflection.User.setName(java.lang.String)


        // 获得指定的构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor: constructors) {
            System.out.println(constructor); //public
        }

        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor: constructors) {
            System.out.println("#" + constructor); //所有
        }

        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定：" + declaredConstructor);
    }
}
