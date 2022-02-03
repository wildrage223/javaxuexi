package oop.demo05;

import oop.demo05.Person;

//学生 is 人
//子类继承了父类，会拥有父类的所有方法
public class Student extends Person {
    private String name = "wyfStudent";

    public Student() {
        //隐藏代码：调用了父类的无参构造
        //super();//调用父类的构造器必须在子类构造器的第一行
        System.out.println("Student无参执行了");
    }

    public void print() {
        System.out.println("Student");
    }

    public void test1() {
        print();//Student
        this.print();//Student
        super.print();//Student
    }

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);//当前
        System.out.println(super.name);//父类
    }
}
