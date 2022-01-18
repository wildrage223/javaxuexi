package array;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9009,543,21,3,23};

        System.out.println(a);//[I@1b6d3586
        //打印数组元素
        System.out.println(Arrays.toString(a));//[1, 2, 3, 4, 9009, 543, 21, 3, 23]

        Arrays.sort(a);//排序数组，升序排序
        System.out.println(Arrays.toString(a));//[1, 2, 3, 3, 4, 21, 23, 543, 9009]


        Arrays.fill(a,0);//数组填充
        System.out.println(Arrays.toString(a));//[0, 0, 0, 0, 0, 0, 0, 0, 0]
    }
}
