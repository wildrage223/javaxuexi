package collection.generic;

public class TestGeneric {
    public static void main(String[] args) {
        //使用泛型类创建对象
        //注意：1泛型只能使用引用类型
        //2不同泛型对象不能相互复制
        MyGeneric<String> myGeneric = new MyGeneric<String>();
        myGeneric.t = "hello";
        myGeneric.show("大家好");//大家好
        String string = myGeneric.getT();
        System.out.println(string);//hello

        //泛型接口
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.server("xxxxxx");//xxxxxx

        MyInterfaceImpl2 imp2 = new MyInterfaceImpl2();
        imp2.server(1000);//1000

        //泛型方法调用
        MyGenericMethod myGenericMethod = new MyGenericMethod();
        myGenericMethod.show("string");//泛型方法string
    }
}
