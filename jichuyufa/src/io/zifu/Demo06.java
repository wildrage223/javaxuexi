package io.zifu;

import java.io.PrintWriter;

/**
 * 演示PrintWriter的使用
 */
public class Demo06 {
    public static void main(String[] args) throws Exception{
        // 1 创建
        PrintWriter printWriter = new PrintWriter("d:\\bbb.txt");
        // 2 打印
        printWriter.println(97);
        printWriter.println(true);
        printWriter.println(3.14);
        printWriter.println('a');
        printWriter.flush();
        // 3 关闭
        printWriter.close();
    }
}
