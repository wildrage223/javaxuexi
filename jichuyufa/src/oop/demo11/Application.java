package oop.demo11;

public class Application {
    public static void main(String[] args) {
        //new
        Outer outer = new Outer();

        //通过外部类使用内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();//这是内部类的方法
        inner.getID();
    }
}
