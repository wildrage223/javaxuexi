package oop.demo08;

//static
public class Student {

    private static int age;//静态变量
    private double score;//非静态变量

    public void run() {
    }

    public static void go() {
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println(Student.age);//静态变量类名点变量调用
        Student.go();//可通过类名调用
    }

}
