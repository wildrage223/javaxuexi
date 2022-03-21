package io.zifu;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * 演示BufferedWriter的使用
 */
public class Demo05 {
    public static void main(String[] args) throws Exception{
        //1创建BufferdWriter对象
        FileWriter fileWriter = new FileWriter("d:\\bbb.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // 2写入
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("你好哦");
            bufferedWriter.newLine();//写入一个换行符  windows \r\n  linux \n
            bufferedWriter.flush();
        }

        // 3关闭
        bufferedWriter.close();
    }
}
