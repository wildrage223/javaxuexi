package com.wyf.net.ip;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 *TestInetSocketAddress
 */
public class TestInetSocketAddress {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",8080);
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress("localhost",8080);
        System.out.println(inetSocketAddress.toString());  // /127.0.0.1:8080
        System.out.println(inetSocketAddress2.toString());  // localhost/127.0.0.1:8080

        InetAddress address = inetSocketAddress.getAddress();
        System.out.println(inetSocketAddress.getAddress()); // /127.0.0.1
        System.out.println(inetSocketAddress.getHostName());  // 127.0.0.1
        System.out.println(inetSocketAddress.getPort()); //8080
    }
}
