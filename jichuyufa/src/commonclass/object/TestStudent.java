package commonclass.object;

public class TestStudent {
    public static void main(String[] args) {
        //1.getClass方法
        Student s1 = new Student("aaa", 20);
        Student s2 = new Student("bbb", 22);
        //判断这两个对象是否为同一类型
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();
        if(class1 == class2) {
            System.out.println("属于同一类型" + class1); //属于同一类型class commonclass.object.Student
        }else {
            System.out.println("不是同一类型" + class1 + class2);
        }
        System.out.println("=====================================");
        //2.hashCode方法
        System.out.println(s1.hashCode());//22307196
        System.out.println(s2.hashCode());//10568834
        Student s3 = s1;
        System.out.println(s3.hashCode());//22307196

        System.out.println("======================================");
        //3.toString
        //类全名称+hash值，转10进制一样
        System.out.println(s1.toString());//commonclass.object.Student@154617c
        System.out.println(s2.toString());//commonclass.object.Student@a14482
        System.out.println("======================================");

        //4.equals方法
        System.out.println(s1.equals(s2));//false

    }
}
