package com.wyf.net.trans;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * 客户端
 */
public class TcpClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            // 1.知道服务器的地址
            InetAddress serverIp = InetAddress.getByName("127.0.0.1");
            int port = 9999;
            // 2.创建一个socket连接
            socket = new Socket(serverIp, port);
            // 3. 发送消息  IO流
            outputStream = socket.getOutputStream();

            outputStream.write("你好，hello".getBytes());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
