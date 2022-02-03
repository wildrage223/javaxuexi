package exception.demo01;

public class Demo01 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        //假设要捕获多个异常，从小到大
        try { //try监控区域
            System.out.println(a/b);
//            new Demo01().a();
        }/*catch (ArithmeticException e) {//catch 捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }*/catch (Error e) {//catch 捕获异常
            System.out.println("Error");
        }catch (Exception e) {//catch 捕获异常
            System.out.println("Exception");
        }catch (Throwable t) {//catch 捕获异常
            System.out.println("Throwable");
        }
        finally { //处理善后工作
            System.out.println("finally");
        }

        //finally 可以不用 使用例如IO资源关闭
    }

    public void a() {
        b();
    }

    public void b() {
        a();
    }
}
