package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 使用字节缓冲流写入文件
 * BufferedOutputStream
 */
public class Demo05 {
    public static void main(String[] args) throws Exception {
        //1 创建字节输出缓冲流
        FileOutputStream fos = new FileOutputStream("d:\\bbb.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        //2 写入文件
        for (int i = 0; i < 10; i++) {
            bos.write("helloworld\r\n".getBytes(StandardCharsets.UTF_8));
            bos.flush(); //刷新到硬盘
        }

        //3 关闭(内部调用flush)
        bos.close();
    }
}
