package operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增，自减 一元运算符
        int a = 3;
        int b = a++;  //执行完这行代码后，先给b赋值，再自增
        //a++ a = a + 1;
        int c = ++a;  //执行完这行代码前，先自增，再给b赋值
        //++a a = a + 1;

        System.out.println(a); //5
        System.out.println(b); //3
        System.out.println(c); //5

        //幂运算 2^3
        double pow = Math.pow(2,3);
        System.out.println(pow);//8.0

    }
}
