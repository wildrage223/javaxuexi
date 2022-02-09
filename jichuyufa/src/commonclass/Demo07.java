package commonclass;

/**
 * System
 */
public class Demo07 {
    public static void main(String[] args) {
        //arraycopy 数组的复制
        //src源数组
        //srcPos从哪个位置开始复制
        //dest 目标数组
        //destPos 目标数组的位置
        //length 复制的长度
        int[] arr = {20,18,15};
        int[] dest = new int[8];
        System.arraycopy(arr,0,dest,0,arr.length);
        for (int i : dest) {
            System.out.println(i);
        }
        //20
        //18
        //15
        //0
        //0
        //0
        //0
        //0

        //currentTimeMillis用于计时
        System.out.println(System.currentTimeMillis());//1644411746684
        //System.gc()垃圾回收

        //exit(0)退出
        System.exit(0);
        //不会执行下面代码
        System.out.println("程序结束");
    }
}
