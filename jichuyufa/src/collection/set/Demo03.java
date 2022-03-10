package collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet使用
 * 存储结构：红黑树
 */
public class Demo03 {
    public static void main(String[] args) {
        //1 创建集合
        TreeSet<String> treeSet = new TreeSet<>();
        //添加元素
        treeSet.add("xyz");
        treeSet.add("abc");
        treeSet.add("hello");
        System.out.println(treeSet.toString());//[abc, hello, xyz]

        //删除
//        treeSet.remove("xyz");

        //增强for
        for (String s:
             treeSet) {
            System.out.println(s);
        }

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //4. 判断
        System.out.println(treeSet.contains("xyz"));
    }
}
