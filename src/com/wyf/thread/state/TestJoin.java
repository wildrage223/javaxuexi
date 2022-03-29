package com.wyf.thread.state;

/**
 * 测试Join方法，插队
 */
public class TestJoin implements Runnable{


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了" + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        // 启动线程
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        for (int i = 0; i < 200; i++) {
            if(i == 100) {
                thread.join();//插队
            }
            System.out.println("main" + i);
        }
    }
}
