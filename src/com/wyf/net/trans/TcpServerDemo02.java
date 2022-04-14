package com.wyf.net.trans;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpServerDemo02 {
    public static void main(String[] args) throws Exception {
        //1.创建服务
        ServerSocket serverSocket = new ServerSocket(9000);
        //2.监听客户端连接
        Socket accept = serverSocket.accept();//阻塞式监听，会一直等待客户端连接
        // 3. 获取输入流
        InputStream inputStream = accept.getInputStream();
        // 4.文件输出
        FileOutputStream fileOutputStream = new FileOutputStream(new File("receive.jfif"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes))!= -1) {
            fileOutputStream.write(bytes, 0, len);
        }

        //通知客户端执行完毕
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("我接收完毕了".getBytes(StandardCharsets.UTF_8));
        //关闭资源
        fileOutputStream.close();
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
