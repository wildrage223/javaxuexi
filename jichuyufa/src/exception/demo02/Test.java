package exception.demo02;

public class Test {

    //可能会存在异常的方法

    static void test(int a) throws MyException{
        System.out.println("传递的参数为：" + a);
        if(a > 10) {
            throw new MyException(a);
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MyException e) {
            System.out.println(e);//MyException{detail=11}
        }
    }
}
