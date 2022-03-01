package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * List的使用
 */
public class Demo02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加数字(自动装箱)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.toString());//[20, 30, 40, 50, 60]

        //删除操作
        //因为删除是角标
        //list.remove(20);//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 20, Size: 5

        //正常删除
//        list.remove(new Integer(20));
//        System.out.println(list.toString());//[30, 40, 50, 60]

        //补充方法subList:返回子集合,含头不含尾
        List subList = list.subList(1, 3);
        System.out.println(subList.toString());//[30, 40]

    }
}
