package oop.demo04;

public class Application {

    public static void main(String[] args) {

        Student student = new Student();
        //继承了父类
        student.say();//说了一句话
        System.out.println(student.getMoney());//1000000000
    }
}
