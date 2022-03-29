package com.wyf.thread;

/**
 * 创建线程方式2：实现runnable接口，重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
 */
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程-----" + i);
        }
    }

    public static void main(String[] args) {

        // 创建runnable接口的实现类对象
        TestThread3 thread3 = new TestThread3();
        // 创建线程对象，通过线程对象来开启线程，代理
//        Thread thread = new Thread(thread3);
//
//        thread.start();

        new Thread(thread3).start();


        // main线程，主线程
        for (int i = 0; i < 20; i++) {
            System.out.println("主线程-------" + i);
        }
    }
}
