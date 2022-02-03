package oop.demo05;

import oop.demo05.Student;

public class Application {

    public static void main(String[] args) {

        Student student = new Student();
        //Person无参执行了
        //Student无参执行了
        student.test("wyftest");
        //wyftest
        //wyfStudent
        //wyfPerson
        student.test1();
        //Student
        //Student
        //Person
    }
}
