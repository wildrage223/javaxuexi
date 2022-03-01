package collection.generic;

/**
 * 泛型接口
 * 注意 不能创建泛型静态常量
 * 语法：接口名<T>
 */
public interface MyInterface<T> {
    String name = "张三";

    T server(T t);
}
