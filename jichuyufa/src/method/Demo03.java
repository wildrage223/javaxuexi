package method;

public class Demo03 {

    public static void main(String[] args) {
        int factorial = f(5);
        System.out.println(factorial);//120
    }

    //阶乘 5！=5*4*3*2*1
    public static int f(int n) {
        if(n == 1) {
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
