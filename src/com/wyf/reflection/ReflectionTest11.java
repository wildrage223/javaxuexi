package com.wyf.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * 反射操作注解
 */
public class ReflectionTest11 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.wyf.reflection.Student2");
        
        // 通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation); //@com.wyf.reflection.Tablewyf(value=db_student)
        }

        // 获得注解value的值
        Tablewyf tablewyf = (Tablewyf)c1.getAnnotation(Tablewyf.class);
        System.out.println(tablewyf.value()); //db_student

        // 获得类指定的注解
        Field name = c1.getDeclaredField("name");
        Fieldwyf annotation = name.getAnnotation(Fieldwyf.class);
        System.out.println(annotation.columnName());//db_name
        System.out.println(annotation.type());// varchar
        System.out.println(annotation.length());//3

    }

}

@Tablewyf("db_student")
class Student2 {
    @Fieldwyf(columnName = "db_id", type = "int", length = 10)
    private int id;
    @Fieldwyf(columnName = "db_age", type = "int", length = 10)
    private int age;
    @Fieldwyf(columnName = "db_name", type = "varchar", length = 3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablewyf {
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldwyf {
    String columnName();
    String type();
    int length();
}

