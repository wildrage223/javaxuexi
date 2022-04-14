package com.wyf.net.trans;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemo02 {

    public static void main(String[] args) throws IOException {
        // 1.创建socket链接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        // 2. 创建一个输出流
        OutputStream outputStream = socket.getOutputStream();

        // 3. 文件流
        FileInputStream fileInputStream = new FileInputStream(new File("政务要闻2.jfif"));
        // 4.写出文件
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }

        //通知服务器结束了
        socket.shutdownOutput();//已经传输完了

        //确定服务器完毕，才能断开链接
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bytes1 = new byte[1024];
        int len1;
        while ((len1 = inputStream.read(bytes1)) != -1) {
            byteArrayOutputStream.write(bytes1, 0, len1);
        }

        System.out.println(byteArrayOutputStream.toString());

        // 关闭资源
        fileInputStream.close();
        outputStream.close();
        socket.close();
    }
}
