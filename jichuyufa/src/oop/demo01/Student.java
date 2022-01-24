package oop.demo01;

//学生类
public class Student {
    //属性，字段
    String name; //null
    int age; //0

    //方法
    public void study() {
        System.out.println(this.name + "在学习");
    }
}


/*
测试方法
    public static void main(String[] args) {
        //类抽象的，需要实例话
        //实例话后返回自己的对象，就是具体的对象
        Student xiaoming = new Student();
        Student xh = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name); //小明
        System.out.println(xiaoming.age); //3


        xh.name = "小红";
        xh.age = 3;

        System.out.println(xh.name); //小红
        System.out.println(xh.age); //3
    }
 */
