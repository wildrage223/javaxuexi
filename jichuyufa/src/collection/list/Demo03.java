package collection.list;

import collection.collection.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * ArrayList使用
 * 存储结构：数组，查找遍历速度快，增删慢
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //1.添加
        Student s1 = new Student("王一",1);
        Student s2 = new Student("王二",2);
        Student s3 = new Student("王三",3);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println(arrayList.toString());
        //[Student{name='王一', age=1}, Student{name='王二', age=2}, Student{name='王三', age=3}]

        //2.删除
        //重写equals
        arrayList.remove(new Student("王一",1));
        System.out.println(arrayList.toString());//[Student{name='王二', age=2}, Student{name='王三', age=3}]

        //3.遍历
        //3.1使用迭代器
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.toString());
            //Student{name='王二', age=2}
            //Student{name='王三', age=3}
        }

        //3.2列表迭代器
        ListIterator listIterator = arrayList.listIterator();
        System.out.println("----------------------------");
        while (listIterator.hasNext()) {
            Student s = (Student)listIterator.next();
            System.out.println(s.toString());
            //Student{name='王二', age=2}
            //Student{name='王三', age=3}
        }
        //逆序
        while (listIterator.hasPrevious()) {
            Student s = (Student)listIterator.previous();
            System.out.println(s.toString());
            //Student{name='王三', age=3}
            //Student{name='王二', age=2}
        }

        //4.判断
        System.out.println(arrayList.contains(new Student("王二",2)));//true
        System.out.println(arrayList.isEmpty());//false

        //5.查找
        System.out.println(arrayList.indexOf(new Student("王二",2)));//0
    }
}
