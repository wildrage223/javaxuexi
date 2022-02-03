package oop.demo05;

public class Application1 {
    public static void main(String[] args) {

        //静态方法的调用只和左边的数据类型有关
        //非静态：重写
        A a = new A();
        a.test();//A=>test()
        a.test1();//A=>test()

        //父类的引用指向子类
        B b = new A();
        b.test();//B=>test()
        b.test1();//A=>test()
    }
}
