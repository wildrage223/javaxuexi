package com.wyf.reflection;

/**
 * 什么叫反射
 */
public class ReflectionTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 通过反射获取类的class对象
        Class c1 = Class.forName("com.wyf.reflection.User");
        System.out.println(c1); //class com.wyf.reflection.User

        // 一个类在内存中只有一个Class对象
        // 一个类被加载后，类的整个结构都会被封装在Class对象中
    }
}

//实体类 pojo entity
class User {
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
