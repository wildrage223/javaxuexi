package com.wyf.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * 使用Thread 实现多线程同步下载图片
 */
public class TestThread2 extends Thread{

    private String url; //网络图片地址

    private String name; //保存的文件名

    public TestThread2(String url, String name) {
        this.url = url;
        this.name = name;
    }

    // 下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名" + name);
    }

    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2("https://t7.baidu.com/it/u=318887420,2894941323&fm=193&f=GIF", "d:\\test\\picture\\picture1.gif");
        TestThread2 t2 = new TestThread2("https://t7.baidu.com/it/u=3779234486,1094031034&fm=193&f=GIF", "d:\\test\\picture\\picture2.gif");
        TestThread2 t3 = new TestThread2("https://t7.baidu.com/it/u=1595072465,3644073269&fm=193&f=GIF", "d:\\test\\picture\\picture3.gif");

        // 同时执行
        t1.start();
        t2.start();
        t3.start();
    }
}


class WebDownloader {
    // 下载方法
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}