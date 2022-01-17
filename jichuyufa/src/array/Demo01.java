package array;

public class Demo01 {

    public static void main(String[] args) {
        int[] nums; //定义，建议

        int nums2[]; //C、C++如此定义

        nums = new int[10];//可以存放10个类型的数字，创建空间
        int i = 0;
        for (int num:nums) {
            nums[i] = i;
            System.out.println(nums[i]);
            i++;
        }
    }
}
