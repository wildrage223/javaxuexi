package com.wyf.thread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.*;

/**
 * 线程创建方式三 实现callable接口
 *
 * 好处
 * 可以有返回值
 * 可以抛出异常
 */
public class TestCallable implements Callable<Boolean> {

    private String url; //网络图片地址

    private String name; //保存的文件名

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    // 下载图片线程的执行体
    @Override
    public Boolean call() {
        WebDownloader1 webDownloader = new WebDownloader1();
        webDownloader.downloader(url, name);
        System.out.println("下载了文件名" + name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://t7.baidu.com/it/u=318887420,2894941323&fm=193&f=GIF", "d:\\test\\picture\\picture1.gif");
        TestCallable t2 = new TestCallable("https://t7.baidu.com/it/u=3779234486,1094031034&fm=193&f=GIF", "d:\\test\\picture\\picture2.gif");
        TestCallable t3 = new TestCallable("https://t7.baidu.com/it/u=1595072465,3644073269&fm=193&f=GIF", "d:\\test\\picture\\picture3.gif");

        //创建执行服务：
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行：
        Future<Boolean> result1 = ser.submit(t1);
        Future<Boolean> result2 = ser.submit(t2);
        Future<Boolean> result3 = ser.submit(t3);

        //获取结果：
        boolean r1 = result1.get();
        boolean r2 = result2.get();
        boolean r3 = result3.get();

        //关闭服务：
        ser.shutdownNow();
    }
}


class WebDownloader1 {
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
