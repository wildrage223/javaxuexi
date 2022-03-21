package io;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 演示文件字节输出流
 * FileOutputStream
 */
public class Demo02 {
    public static void main(String[] args) throws Exception {
        //1 创建文件字节输出流对象
        FileOutputStream fos = new FileOutputStream("d:\\bbb.txt");
        //2 写入文件
//        fos.write(97);
//        fos.write('b');
//        fos.write('c');
        String str = "hello world你好";
        fos.write(str.getBytes(StandardCharsets.UTF_8));
        //3 关闭
        fos.close();
        System.out.println("执行完毕");
    }
}
