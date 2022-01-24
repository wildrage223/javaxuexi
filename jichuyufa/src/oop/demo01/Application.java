package oop.demo01;
//一个项目只有一个main方法
public class Application {
    public static void main(String[] args) {
        //new 关键字实例化一个对象
        Person person = new Person("wyf");

        System.out.println(person.name);
    }
}
