package com.wyf.reflection;

/**
 * 测试类什么时候会初始化
 */
public class ReflectionTest05 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.主动引用
        //main类被加载
        //父类别加载
        //子类被加载
//        Son son = new Son();

        // 反射也会主动加载
        //main类被加载
        //父类别加载
        //子类被加载
//        Class.forName("com.wyf.reflection.Son");


        // 不会产生类的引用方法
        //main类被加载
        //父类别加载
        //2
//        System.out.println(Son.b);

        // 数组
        //main类被加载
//        Son[] arr = new Son[5];


        //main类被加载
        //1
        System.out.println(Son.M);

    }
}

class Father {

    static int b = 2;

    static {
        System.out.println("父类别加载");
    }

}

class Son extends Father {

    static {
        System.out.println("子类被加载");
        m = 300;
    }

    static int m = 100;
    static final int M = 1;
}
