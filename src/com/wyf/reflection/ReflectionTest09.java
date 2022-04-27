package com.wyf.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 分析性能问题
 */
public class ReflectionTest09 {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01(); //普通方法执行：5ms
        test02(); //通过反射方式：439ms
        test03(); //反射方式，关闭检测：19ms

    }

    // 通过普通方式调用
    public static void test01() {
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行：" + (endTime - startTime) + "ms");
    }


    // 通过反射方式
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过反射方式：" + (endTime - startTime) + "ms");
    }



    // 反射方式，关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();
        Method getName = c1.getMethod("getName", null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式，关闭检测：" + (endTime - startTime) + "ms");
    }
}
