package operator;

//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
        //与 或 非
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:" + (a && b));//逻辑与：两个变量都为真，结果为真  false
        System.out.println("a || b:" + (a || b));//逻辑或：两个有一个为真，结果为真  true
        System.out.println("!(a && b):" + !(a && b));//如果是真即为假，反之亦然  true

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);
        System.out.println(d); //false
        System.out.println(c); //5
    }
}
