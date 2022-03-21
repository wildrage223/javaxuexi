package io.zifu;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 使用OutputStreamWriter写入文件，使用指定的编码
 */
public class Demo08 {
    public static void main(String[] args) throws Exception{
        // 1 创建流
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\bbb.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");

        //2 写入
        for (int i = 0; i < 10; i++) {
            outputStreamWriter.write("我呜呜呜" + i + "\r\n");
        }

        //3 关闭
        outputStreamWriter.close();
    }
}
