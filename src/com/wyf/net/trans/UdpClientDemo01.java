package com.wyf.net.trans;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * 不需要连接服务器
 */
public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.建立一个Socekt
        DatagramSocket datagramSocket = new DatagramSocket();

        // 2.建立个包
        String msg = "你好啊";
        // 发送的人
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8), 0, msg.getBytes(StandardCharsets.UTF_8).length, localhost, port);

        // 3.发送包

        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
