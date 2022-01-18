package array;

public class Demo02 {
    public static void main(String[] args) {
        //静态初始化，创建+赋值
        int[] a = {1,2,3};
        System.out.println(a[0]);//1

        //动态初始化，包含隐式初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);//10
        System.out.println(b[1]);//0
    }
}
