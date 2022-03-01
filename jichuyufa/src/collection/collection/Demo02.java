package collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection的使用：保存学生信息
 */
public class Demo02 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        Student s1 = new Student("张一",20);
        Student s2 = new Student("张二",18);
        Student s3 = new Student("张三",15);
        //1.添加数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println(collection.toString());
        //[Student{name='张一', age=20}, Student{name='张二', age=18}, Student{name='张三', age=15}]

        //2.删除
//        collection.remove(s1);
//        collection.clear();
        //3.遍历
        for (Object obj:
             collection) {
            Student s = (Student)obj;
            System.out.println(s.toString());
            //Student{name='张一', age=20}
            //Student{name='张二', age=18}
            //Student{name='张三', age=15}
        }
        //迭代器
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s.toString());
            //Student{name='张一', age=20}
            //Student{name='张二', age=18}
            //Student{name='张三', age=15}
        }

        //4.判断
        System.out.println(collection.contains(s1));//true
        System.out.println(collection.isEmpty());//false

    }
}
