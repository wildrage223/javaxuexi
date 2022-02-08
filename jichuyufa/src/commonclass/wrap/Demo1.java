package commonclass.wrap;

public class Demo1 {
    public static void main(String[] args) {
        //面试题
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1 == integer2);//false

        Integer integer3 = 100;
        Integer integer4 = 100;
        Integer.valueOf(100);
        System.out.println(integer3 == integer4);//true  实际调用Integer.valueOf(100)
        //public static Integer valueOf(int i) {
        //        if (i >= IntegerCache.low && i <= IntegerCache.high)
        //            return IntegerCache.cache[i + (-IntegerCache.low)];
        //        return new Integer(i);
        //    }
        //IntegerCache.low -128    IntegerCache.high  127

        Integer integer5 = 200;
        Integer integer6 = 200;
        System.out.println(integer5 == integer6);//false
    }
}
