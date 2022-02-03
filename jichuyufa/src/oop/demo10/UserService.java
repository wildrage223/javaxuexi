package oop.demo10;

//interface 定义的关键字，接口都需要有实现类
public interface UserService {
    //属性为常量 public static final
    int age = 99;

    //接口中的所有定义的方法其实都是抽象的 public abstract
    void add();
    void delete();
    void update();
    void query();
}
