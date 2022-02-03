package oop.demo05;

//所有类都直接或间接继承Object
//父类
public class Person {
    protected String name = "wyfPerson";

    public Person() {
        System.out.println("Person无参执行了");
    }

    //私有的无法被继承
    public void print() {
        System.out.println("Person");
    }
}
