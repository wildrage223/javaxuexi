package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口使用说明
 * (1)添加元素
 * (2)删除元素
 * (3)遍历元素
 * (4)判断
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();
        // * (1)添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println(collection);//[苹果, 西瓜, 榴莲]
        // * (2)删除元素
        collection.remove("榴莲");
        System.out.println(collection);//[苹果, 西瓜]
//        collection.clear();
//        System.out.println(collection);//[]
        // * (3)遍历元素
        //增强for
        for (Object object:
             collection) {
            System.out.println(object);
        }
        //苹果
        //西瓜

        //使用迭代器，专门遍历集合的一种方式
        Iterator it = collection.iterator();
        //hasNext()有没有下一个元素
        //next()获取下一个元素
        //remove()删除下一个元素，迭代中不允许使用collection的删除方法
        while (it.hasNext()) {
            String s = (String)it.next();
            System.out.println(s);
//            it.remove();//迭代器删除
        }
        //苹果
        //西瓜
//        System.out.println("迭代器删除后" + collection);//迭代器删除后[]


        // * (4)判断
        System.out.println(collection.contains("西瓜"));//true
        System.out.println(collection.isEmpty());//false

    }
}
