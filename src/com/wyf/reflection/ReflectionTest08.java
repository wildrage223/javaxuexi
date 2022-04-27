package com.wyf.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射创建对象
 */
public class ReflectionTest08 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.wyf.reflection.User");

        //构造对象
        User user = (User)c1.newInstance(); //调用了类的无参构造，没有报错
        System.out.println(user); //User{name='null', id=0, age=0}

        // 通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)constructor.newInstance("wyf", 001, 18);
        System.out.println(user2); //User{name='wyf', id=1, age=18}


        // 通过反射调用方法
        // 获取方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        setName.invoke(user, "wyf"); //激活 （对象，方法的值）
        System.out.println(user.getName());//wyf


        // 通过反射操作属性
        // 不能直接访问私有属性，通过关闭安全监测，通过setAccessible(true)
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true); //取消安全监测，可以访问私有
        name.set(user, "wyf2");
        System.out.println(user.getName());

    }
}
