package com.wyf.net.trans;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class TcpServerDemo01 {
    public static void main(String[] args) {

        ServerSocket serverSocket =  null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;

        try {
            // 1.我有一个地址
            serverSocket = new ServerSocket(9999);
            // 2.等待客户端连接过来
            accept = serverSocket.accept();
            // 3.读取客户端的消息
            inputStream = accept.getInputStream();

            /**
             *             byte[] buffer = new byte[1024];
             *             int len;
             *             while((len = inputStream.read(buffer)) != -1) {
             *                 String msg = new String(buffer, 0 , len);
             *                 System.out.println(msg);
             *             }
             *             可能乱码
             */

            // 管道
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes, 0, len);
            }
            System.out.println(byteArrayOutputStream.toString());




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            if(byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
