package io.zifu;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 使用InputStreamReader读取文件，指定使用的编码
 */
public class Demo07 {
    public static void main(String[] args) throws Exception{
        //1 创建对象
        FileInputStream fileInputStream = new FileInputStream("d:\\bbb.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);

        //2读取文件
        int data = 0;
        while ((data = inputStreamReader.read()) != -1) {
            System.out.print((char)data);
        }
        // 3 关闭
        inputStreamReader.close();
    }
}
