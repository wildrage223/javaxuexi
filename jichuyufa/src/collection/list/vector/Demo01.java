package collection.list.vector;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector集合的使用
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        Vector vector = new Vector<>();
        //1 添加元素
        vector.add("草莓");
        vector.add("芒果");
        vector.add("西瓜");
        System.out.println(vector.size());//3
        //2 删除
        vector.remove(0);
        vector.remove("西瓜");
        vector.clear();
        //3 枚举器
        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String s = (String)enumeration.nextElement();
            System.out.println(s);
        }
        //4 判断
        System.out.println(vector.contains("西瓜"));
        System.out.println();
        //5 其他方法
        //firstElement lastElement elementAt()
    }
}
