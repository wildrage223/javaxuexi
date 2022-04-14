package com.wyf.net.trans;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/helloworld/index.jsp?username=wyf&pwd=111");
        System.out.println(url.getProtocol()); // 协议名  http
        System.out.println(url.getHost());  // 主机 localhost
        System.out.println(url.getPort());  // 端口 8080
        System.out.println(url.getPath());  // 文件 /helloworld/index.jsp
        System.out.println(url.getFile());  // 文件全路径 /helloworld/index.jsp?username=wyf&pwd=111
        System.out.println(url.getQuery()); // 参数 username=wyf&pwd=111
    }
}
