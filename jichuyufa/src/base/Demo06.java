package base;

public class Demo06 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK新特性 数字之间可以用下划线分割
        int money = 10_0000_0000;
        System.out.println(money); //1000000000
        int years = 20;
        int total = money * years; //计算的时候溢出了
        long total2 = money * years; //默认是int 转换之前已经存在问题了
        long total3 = money*((long)years); //先把一个数转为Long
        System.out.println(total); //-1474836480
        System.out.println(total2); //-1474836480
        System.out.println(total3); //20000000000

        //L l虽然都能表示long，最好使用大写，明显。
    }
}
