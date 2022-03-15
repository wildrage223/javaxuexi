package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件字节流实现文件的复制
 */
public class Demo03 {
    public static void main(String[] args) throws Exception {
        //1 创建流
        // 1.1 文件字节输入流
        FileInputStream fis = new FileInputStream("C:\\Users\\wangy\\Pictures\\Saved Pictures\\政务要闻.png");
        // 1.2 文件字节输出流
        FileOutputStream fos = new FileOutputStream("C:\\Users\\wangy\\Pictures\\Saved Pictures\\政务要闻2.png");
        // 2 一边读，一边写
        byte[] bytes = new byte[1024];
        int count = 0;
        while((count = fis.read(bytes)) != -1) {
            fos.write(bytes,0, count);
        }
        //3.关闭
        fis.close();
        fos.close();
        System.out.println("复制完毕");
    }
}
