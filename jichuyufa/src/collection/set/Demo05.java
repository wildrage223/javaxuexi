package collection.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合的使用
 * Comparator实现定制比较（比较器）
 */
public class Demo05 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Person> personTreeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //比姓名
                int n1 = o1.getName().compareTo(o2.getName());
                // 比年龄
                int n2 = o1.getAge()-o2.getAge();

                return n1 == 0?n2:n1;
            }
        });

        Person p1 = new Person("wyf1", 20);
        Person p2 = new Person("wyf2", 20);
        Person p3 = new Person("wyf3", 20);
        Person p4 = new Person("wyf3", 18);


        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);

        System.out.println(personTreeSet.toString());
    }
}
