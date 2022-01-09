package base;

public class Demo03 {
    public static void main(String[] args) {
        //整数扩展 进制 二进制0b 十进制 八进制0 十六进制0x
        int i = 10;
        int i2 = 010;//八进制
        int i3 = 0x10;//十六进制 0~9 A~F
        int i4 = 0b10;//二进制

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("==============================================");
        //==============================================
        //浮点数扩展   银行业务怎么表示？ 钱
        //BigDecimal 数学工具，银行不能用浮点数比较
        //==============================================
        //float 有限 离散 舍入误差 接近但不等于

        //double
        //最好完全避免使用浮点数进行比较
        //最好完全避免使用浮点数进行比较
        //最好完全避免使用浮点数进行比较
        float f = 0.1f; //0.1
        double d = 1.0/10; //0.1
        System.out.println(f==d); //false
        System.out.println(f);
        System.out.println(d);
        float d1 = 131231312341243214234f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2); //true
        System.out.println("========================================");

        //========================================
        //字符扩展
        //========================================
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);//强制转换
        System.out.println(c2);
        System.out.println((int)c2);//强制转换
        //所有字符本质是数字
        //编码 Unicode对应表，97=a 2字节 65536 Excel 2^16=65536

        char c3 = '\u0061';
        System.out.println(c3); //a

        //转义字符
        //  \t 制表符
        // \n 换行

        System.out.println("Hello\tWorld");


        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);//false

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);//true
        //对象 内存

        //布尔值扩展
        boolean flag = true;
        if(flag == true) {} //新手
        if(flag){} //老手
        //Less is More！ 代码要精简易读
    }
}
