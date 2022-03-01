package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List子接口的使用
 * 特点：1.有序有下标
 * 2.可以重复
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        List list = new ArrayList();
        //1.添加元素
        list.add("苹果");
        list.add("小米");
        list.add(0,"华为");
        System.out.println(list.toString());//[华为, 苹果, 小米]
        //2.删除元素
//        list.remove("苹果");
//        System.out.println(list.toString());//[华为, 小米]
//        list.remove(0);
////        System.out.println(list.toString());//[苹果, 小米]

        //3.遍历
        //3.1for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //华为
            //苹果
            //小米
        }
        //3.2增强for
        for (Object obj:
             list) {
            System.out.println(obj);
            //华为
            //苹果
            //小米
        }
        //3.3使用迭代器
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //华为
            //苹果
            //小米
        }
        //3.4使用列表迭代器,与Iterator区别，
        //ListIterator可以向前或向后遍历，添加，删除，修改元素
        ListIterator listIterator = list.listIterator();
        System.out.println("------------使用列表迭代器从前往后---------------------");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex() + ":" +listIterator.next());
            //0:华为
            //1:苹果
            //2:小米
        }

        System.out.println("------------使用列表迭代器从后往前---------------------");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previousIndex() + ":" +listIterator.previous());
            //2:小米
            //1:苹果
            //0:华为
        }

        //4.判断
        System.out.println(list.contains("苹果"));//true
        System.out.println(list.isEmpty());//false

        //5.获取位置
        System.out.println(list.indexOf("华为"));//0

    }
}
