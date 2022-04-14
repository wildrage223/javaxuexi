package com.wyf.net.trans;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//等待客户端连接
public class UdpServerDemo01 {

    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(9090);

        //接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, 0, bytes.length);

        datagramSocket.receive(datagramPacket); //阻塞接收

        System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

        datagramSocket.close();
    }
}
