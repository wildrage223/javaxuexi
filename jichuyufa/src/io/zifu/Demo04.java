package io.zifu;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 使用字符缓冲流读取文件
 * BufferedReader
 */
public class Demo04 {
    public static void main(String[] args) throws Exception{
        //1创建缓冲流
        FileReader fileReader = new FileReader("d:\\bbb.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //2读取
        // 2.1
//        char[] buf = new char[1024];
//        int count = 0;
//        while ((count = bufferedReader.read(buf)) != -1) {
//            System.out.print(new String(buf, 0, count));//hello world你好
//        }

        //2.2一行一行读
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);//hello world你好
        }

        //3 关闭
        bufferedReader.close();
    }
}
