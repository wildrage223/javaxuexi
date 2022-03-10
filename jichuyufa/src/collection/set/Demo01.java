package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试Set接口使用
 * 特点：1.无序，没有下标
 * 2. 不能重复
 */
public class Demo01 {
    public static void main(String[] args) {
        // 创建集合
        Set<String> set = new HashSet<>();
        //1 添加数据
        set.add("苹果");
        set.add("华为");
        set.add("小米");
        set.add("华为");
        System.out.println(set.toString());//[苹果, 华为, 小米]

        //2.删除
//        set.remove("小米");
//        System.out.println(set.toString());//[苹果, 华为]

        //3. 遍历
        //3.1增强for
        for (String s:
             set) {
            System.out.println(s);
        }

        // 3.2迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //4 判断
        System.out.println(set.contains("华为"));//true
        System.out.println(set.isEmpty());//false
    }
}
