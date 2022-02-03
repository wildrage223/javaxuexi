package exception.demo01;

public class Demo02 {

    public static void main(String[] args) {
        try {
            new Demo02().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    //方法处理不了异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if(b == 0) {//主动抛出异常 一般在方法中使用 throw throws
            throw new ArithmeticException();
        }
        System.out.println(a/b);
    }
}
