package io.zifu;

import java.io.FileInputStream;
import java.io.FileReader;

/**
 * 使用FileReader读取文件
 */
public class Demo01 {
    public static void main(String[] args)  throws Exception{
        // 1创建对象
        FileReader fileReader = new FileReader("d:\\bbb.txt");
        // 2读取
        // 2.1单个读取
//        int data = 0;
//        while ((data = fileReader.read()) != -1) { //读取一个字符
//            System.out.print((char)data);//撒打发撒旦风口浪尖了解放拉萨解放了就
//        }
        // 2.2字符缓冲区
        char[] buf = new char[1024];
        int count = 0;
        while ((count = fileReader.read(buf)) != -1) {
            System.out.println(new String(buf, 0, count));//撒打发撒旦风口浪尖了解放拉萨解放了就
        }
        // 3 关闭
        fileReader.close();
    }
}
