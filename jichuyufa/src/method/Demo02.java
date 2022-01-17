package method;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.test(11);

    }

    public void test(int... i) {
        System.out.println(i[0]);
    }
}
