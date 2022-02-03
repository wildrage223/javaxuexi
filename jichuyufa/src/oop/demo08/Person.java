package oop.demo08;

public class Person {
    //2 赋初始值
    {
        //代码块（匿名代码块）
        System.out.println("匿名代码块");
    }

    //1
    static {
        //静态代码块 只执行一次
        System.out.println("静态代码块");
    }

    //3
    public Person() {
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person = new Person();
        //静态代码块
        //匿名代码块
        //构造方法
        System.out.println("=================");
        Person person1 = new Person();
        //匿名代码块
        //构造方法
    }
}
