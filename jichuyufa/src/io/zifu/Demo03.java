package io.zifu;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用FileReader和FileWriter复制文本文件，不能复制图片或二进制文件
 * 使用字节流复制任意文件
 */
public class Demo03 {
    public static void main(String[] args) throws Exception{
        // 1 创建
        FileReader fileReader = new FileReader("d:\\bbb.txt");
        FileWriter fileWriter = new FileWriter("d:\\bbb1.txt");
        // 2 读写
        int data = 0;
        while ((data = fileReader.read()) != -1) {
            fileWriter.write(data);
            fileWriter.flush();
        }
        // 3关闭
        fileReader.close();
        fileWriter.close();
    }
}
