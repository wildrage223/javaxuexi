package commonclass.object;

public class TestStudent2 {
    public static void main(String[] args) {
        new Student("aaa", 20);
        new Student("aab", 21);
        new Student("aac", 22);
        new Student("aad", 23);
        new Student("aae", 24);
        //回收垃圾
        System.gc();
        //垃圾回收
        //垃圾回收
        //垃圾回收
        //垃圾回收
        //垃圾回收
    }
}
