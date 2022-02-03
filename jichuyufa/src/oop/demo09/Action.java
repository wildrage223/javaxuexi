package oop.demo09;

//abstract 抽象类；类 extends 单继承。 接口可以多继承
public abstract class Action {

    //约束 有人帮我们实现
    //abstract 抽象方法，只有方法名字，没有方法实现！
    public abstract void doSomething();

    //1.不能new抽象类，只能靠子类实现它，约束
    //2.抽象类中可以写普通的方法
    //3.抽象方法必须在抽象类中
}
