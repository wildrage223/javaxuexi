package oop.demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的

        //可以指向的引用类型就不确定，父类的引用指向引用
        //Student 能调用的方法都是自己的或者继承父类的
        Student s1 = new Student();
        //Person父类，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3 = new Student();

        //能执行哪些方法，主要看对象左边的类型和右边关系不大
        s1.run();//son run
        s1.eat();//son eat
        s2.run();//son run
    }
}
