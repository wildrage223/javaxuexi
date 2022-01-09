package operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 1315113513131L;
        int b = 123;
        short c = 10;
        byte d = 8;
        //里面有long 则为long,其他为int
        System.out.println(a+b+c+d);//Long 1315113513272
        System.out.println(b+c+d);//Int 141
        System.out.println(c+d);//Int 18
    }
}
