package array;

import java.util.Arrays;

public class Demo05 {
    public static void main(String[] args) {
        int[] a = {1,4,2,6,9,3,66,23};

        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort)); //[1, 2, 3, 4, 6, 9, 23, 66]
    }

    //冒泡排序
    //比较两个数组中相邻元素，第一个比第二个大，交换位置
    //每次比较会产生出最大或最小的数字
    //下一轮可以少一次排序
    //一次循环直到结束
    public static int[] sort(int[] array) {
        int temp;
        //外层循环，判断要走多少次
        for(int i = 0; i < array.length-1; i++) {
            boolean flag = false;//通过flag标记位减少没有意义的比较
            //内存循环，比较两个数
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }

            if(flag == false) {
                break;
            }
        }
        return array;

    }
}
