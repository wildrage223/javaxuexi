package oop.demo01;

public class Person {
    //显式定义构造器
    String name;

    //使用new关键字需要有构造器
    //无参构造，用来初始化值
    public Person() {
        this.name = "wyf";
    }

    //有参构造，一旦定义有参，无参构造必须显示定义
    public Person(String name) {
        this.name = name;
    }

    //alt + insert生成构造器等快捷键
}


/*
    public static void main(String[] args) {
        //new 关键字实例化一个对象
        Person person = new Person("wyf");

        System.out.println(person.name);
    }
 */