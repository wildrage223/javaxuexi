package io.zifu;

import java.io.FileWriter;

/**
 * 使用FileWriter写入文件
 */
public class Demo02 {
    public static void main(String[] args) throws Exception{
        // 1创建对象
        FileWriter fileWriter = new FileWriter("d:\\bbb.txt");
        // 2写入
        for (int i = 0; i < 10; i++) {
            fileWriter.write("你好！");
            fileWriter.flush();
        }
        // 3 关闭
        fileWriter.close();
    }
}
