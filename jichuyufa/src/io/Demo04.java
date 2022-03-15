package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 使用字节缓冲流读取
 * BufferedInputStream
 */
public class Demo04 {
    public static void main(String[] args) throws Exception {
        //1 创建
        FileInputStream fileInputStream = new FileInputStream("d:\\aaa.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //2 读取
//        int data = 0;
//        while ((data = bufferedInputStream.read()) != -1) {
//            System.out.print((char)data);//abcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefg
//        }

        //
        byte[] bytes = new byte[1024];
        int count = 0;
        while ((count = bufferedInputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,count));//abcdefgabcdefgabcdefgabcdefgabcdefgabcdefgabcdefg
        }


        //3. 关闭
        bufferedInputStream.close();
    }
}
