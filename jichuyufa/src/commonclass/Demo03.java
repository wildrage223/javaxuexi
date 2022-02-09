package commonclass;

import java.math.BigDecimal;

/**
 * BigDecimal验证
 */
public class Demo03 {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;
        System.out.println(d1-d2);//0.09999999999999998
        //BigDecimal 大浮点数精确计算
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");
        //减法
        BigDecimal r1 = bd1.subtract(bd2);
        System.out.println(r1);//0.1

        //加法
        BigDecimal r2 = bd1.add(bd2);
        System.out.println(r2);//1.9

        //乘法
        BigDecimal r3 = bd1.multiply(bd2);
        System.out.println(r3);//0.90

        //除法
        BigDecimal r4 = bd2.divide(bd1);
        System.out.println(r4);//0.9

        //除不尽  四舍五入 保留两位
        BigDecimal r5 = bd1.divide(bd2,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(r5);//1.11

    }
}
