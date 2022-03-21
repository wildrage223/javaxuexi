package io;

import java.io.FileInputStream;

/**
 * 演示FileInputStream的使用
 * 文件字节输入流
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //1. 创建文件字节输入流，并指定文件路径
        FileInputStream fis = new FileInputStream("d:\\bbb.txt");

        //2. 读取文件
        //2.1 一个一个字节读fis.read();
//        int data = 0;
//        while ((data = fis.read()) != -1) { // 返回-1说明到头
//            System.out.print((char)data);//abcdefg
//        }

        //2.2 一次读多个字节
        byte[] bytes = new byte[3];
        int count = 0;
        while ((count = fis.read(bytes)) != -1) {
            System.out.print(new String(bytes, 0 , count));//abcdefg
        }


        //3. 关闭
        fis.close();
        System.out.println("执行完毕");
    }
}
