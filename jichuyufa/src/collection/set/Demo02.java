package collection.set;

import java.util.HashSet;

/**
 * HashSet集合的使用
 * 存储结构：哈希表（数组+链表+红黑树）
 */
public class Demo02 {
    public static void main(String[] args) {
        // 新建集合
        HashSet<String> hashSet = new HashSet<String>();
        //1 添加元素
        hashSet.add("wyf");
        hashSet.add("wyf1");
        hashSet.add("wyf2");
        hashSet.add("wyf3");
        System.out.println(hashSet.toString());//[wyf, wyf3, wyf2, wyf1]
        //2 删除
        hashSet.remove("wyf");
        // 其他与Demo01相同

    }
}
