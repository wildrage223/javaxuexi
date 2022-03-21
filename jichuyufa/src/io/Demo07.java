package io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 使用ObjectInputStream实现反序列化（读取重构对象）

 *
 */
public class Demo07 {
    public static void main(String[] args) throws Exception {
        //1 创建对象流
        FileInputStream fileInputStream = new FileInputStream("d:\\stu.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        //2 读取文件(反序列化)
//        Student student = (Student)objectInputStream.readObject();
        ArrayList<Student> list = (ArrayList<Student>) objectInputStream.readObject();

        //3 关闭
        objectInputStream.close();
//        System.out.println(student.toString());//Student{name='张三', age=20}
        System.out.println(list.toString()); //[Student{name='张一', age=0}, Student{name='张二', age=0}]
    }
}
