package com.wyf.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 测试IP
 */
public class TestInetAddress {
    public static void main(String[] args) {
        try {
            // 查询本机地址
            InetAddress inetAddress1 = InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1);// /127.0.0.1

            InetAddress inetAddress3 = InetAddress.getByName("localhost");
            System.out.println(inetAddress3);// localhost/127.0.0.1

            InetAddress inetAddress4 = InetAddress.getLocalHost();
            System.out.println(inetAddress4);// LAPTOP-V6I49T1V/192.168.1.102

            // 查询网络地址
            InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress2);// www.baidu.com/110.242.68.3


            // 常用方法
            //System.out.println(inetAddress2.getAddress()); //[B@140e19d
            // 获取规范名字
            System.out.println(inetAddress2.getCanonicalHostName()); //110.242.68.4
            //ip
            System.out.println(inetAddress2.getHostAddress()); //110.242.68.4
            //域名或自己电脑的名字
            System.out.println(inetAddress2.getHostName()); //www.baidu.com


        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
