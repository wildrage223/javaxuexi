package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Collection工具类的使用
 */
public class Demo04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(5);
        list.add(12);
        list.add(30);
        list.add(6);
        // 排序
        System.out.println("排序之前" + list.toString());//排序之前[20, 5, 12, 30, 6]
        Collections.sort(list);
        System.out.println("排序之后" + list.toString());//排序之后[5, 6, 12, 20, 30]

        //二分查找binarySearch
        int i = Collections.binarySearch(list, 12);
        System.out.println(i);//2


        //复制copy
        List<Integer> dest = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            dest.add(0);
        }
        Collections.copy(dest, list);//需保证两个链表大小一致
        System.out.println(dest.toString());//[5, 6, 12, 20, 30]

        //reverse反转
        Collections.reverse(list);
        System.out.println("反转之后" + list);//反转之后[30, 20, 12, 6, 5]

        //shuffle打乱
        Collections.shuffle(list);
        System.out.println(list);

        //补充 list转成数组
        Integer[] arr =  list.toArray(new Integer[0]);  //最好小于list长度，这样生成的数组与list一致
        System.out.println(Arrays.toString(arr));//[20, 12, 30, 6, 5]

        //数组转成list,集合是受限集合，不能添加或删除
        List<Integer> list2 = Arrays.asList(arr);
//        list2.add(1);//会报错
        System.out.println(list2.toString());//[30, 20, 12, 6, 5]

        //把基本类型数组转成集合时，需要修改为包装类型
        Integer[] nums = {1,2,8,3};//不能用int
        List<Integer> listNum = Arrays.asList(nums);
    }
}
