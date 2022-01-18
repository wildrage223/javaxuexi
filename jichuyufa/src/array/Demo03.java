package array;

public class Demo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //打印全部的数组元素
        //JDK1.5，没有下标
        for (int array : arrays) {
            System.out.println(array);
        }

        printArray(arrays);

        printArray(reverse(arrays));
    }

    //打印数组元素
    public static void printArray(int[] arrays) {
        for (int array : arrays) {
            System.out.println(array);
        }
    }

    //反转数组
    public static int[] reverse(int[] arrays) {
        int[] result = new int[arrays.length];
        //反转操作
        for (int i = 0; i < arrays.length; i++) {
            result[arrays.length - i - 1] = arrays[i];
        }

        return result;
    }
}
