package io;

import java.io.Serializable;

/**
 * 学生类
 */
public class Student implements Serializable {

    /**
     * serialVersionUID：序列化版本号ID
     */
    private static final long serialVersionUID = 100L;
    private String name;

    /**
     * transient修饰不能序列化
     */
    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
