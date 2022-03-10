package collection.set;

import java.util.TreeSet;

/**
 * TreeSet保存数据
 * 存储结构：红黑树
 * 要求：元素必须要实现Comparable,compareTo方法返回值为0，认为是重复元素
 */
public class Demo04 {
    public static void main(String[] args) {
        //Person需实现Comparable  compareTo
        TreeSet<Person> personTreeSet = new TreeSet<>();

        Person p1 = new Person("wyf1", 20);
        Person p2 = new Person("wyf2", 20);
        Person p3 = new Person("wyf3", 20);
        Person p4 = new Person("wyf3", 18);


        personTreeSet.add(p1);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);

        System.out.println(personTreeSet.toString());
        //Person{name='wyf1', age=20}, Person{name='wyf2', age=20}, Person{name='wyf3', age=18}, Person{name='wyf3', age=20}]

        // 删除
//        personTreeSet.remove(p1);

        //遍历与上相同

    }
}
