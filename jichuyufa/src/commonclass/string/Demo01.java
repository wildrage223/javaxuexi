package commonclass.string;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        String name = "hello";//“hello”常量存储在字符串池中，在方法区中
        name = "zhangsan";//没有在修改方法区的“hello”，而是创建了"zhangsan"空间，将name指向新的空间
        String name2= "zhangsan";//指向方法区的同一个“zhangsan”

        //演示字符串的另一种创建方式
        String str = new String("wyf");

        //字符串方法的使用
        String content = "wyf111";
        //返回字符串的长度
        System.out.println(content.length());//6
        //返回某个位置的字符
        System.out.println(content.charAt(1));//y
        //判断是否包含某个子字符串
        System.out.println(content.contains("wyf"));//true

        //返回字符串对应的数组
        System.out.println(Arrays.toString(content.toCharArray()));//[w, y, f, 1, 1, 1]
        //返回子字符串首次出现的位置
        System.out.println(content.indexOf("wyf"));//0
        //返回字符串最后一次出现的位置
        System.out.println(content.lastIndexOf("1"));//5

        //去掉字符串前后空格
        System.out.println(content.trim());//wyf111
        //小写转大写，大写转小写
        System.out.println(content.toUpperCase());//WYF111
        System.out.println(content.toLowerCase());//wyf111
        //是否以此为结尾或开头
        System.out.println(content.startsWith("wyf"));//true
        System.out.println(content.endsWith("1"));//true

        //替换
        System.out.println(content.replace("1", "2"));//wyf222
        //拆分
        System.out.println(Arrays.toString(content.split("y")));//[w, f111]
    }
}
