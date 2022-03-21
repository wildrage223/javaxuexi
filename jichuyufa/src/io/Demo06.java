package io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 使用ObjectOutputStream实现对象的序列化
 * 要求：序列化类必须要实现Serializable接口
 *  注意：
 *  1 序列化类必须实现Serializable接口
 *  2 类中的对象属性也需实现Serializable接口
 *  3 序列化版本号ID serialVersionUID，保证序列化类和反序列化类是同一个
 *  4 使用transient（瞬间的）修饰不被序列化的属性。
 *  5 静态属性也无法序列化
 *  6 序列化多个对象
 *  7 序列化多个对象，可以借助集合实现
 */
public class Demo06 {
    public static void main(String[] args) throws Exception {
        //1 创建对象流
        FileOutputStream fos = new FileOutputStream("d:\\stu.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);

        //2 序列化（写入操作）
//        Student zhangsan = new Student("张三", 20);
//        objectOutputStream.writeObject(zhangsan); //需要对象先序列化 implements Serializable 标记可序列化

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张一",  20));
        list.add(new Student("张二",  20));
        objectOutputStream.writeObject(list);

        //3 关闭
        objectOutputStream.close();
        System.out.println("序列化完毕");
    }
}
