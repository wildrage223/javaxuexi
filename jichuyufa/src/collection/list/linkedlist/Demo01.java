package collection.list.linkedlist;

import collection.collection.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * linkedlist使用
 * 存储结构双向链表
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        LinkedList linkedList = new LinkedList<>();
        //添加元素
        Student s1 = new Student("张一",20);
        Student s2 = new Student("张二",18);
        Student s3 = new Student("张三",15);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println(linkedList.size());//3
        System.out.println(linkedList.toString());//[Student{name='张一', age=20}, Student{name='张二', age=18}, Student{name='张三', age=15}]

        //删除
//        linkedList.remove(s1);
//        linkedList.clear();

        //遍历
        //for遍历
        for (int i = 0; i < linkedList.size() ; i++) {
            System.out.println(linkedList.get(i));
        }

        //增强for
        for (Object object:
             linkedList) {
            Student s = (Student)object;
            System.out.println(s);
        }

        //迭代器
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Student s = (Student)iterator.next();
            System.out.println(s.toString());
        }
        // 列表迭代器
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            Student s = (Student) listIterator.next();
            System.out.println(s.toString());
        }

        // 获取
        System.out.println(linkedList.indexOf(s1));
    }
}
