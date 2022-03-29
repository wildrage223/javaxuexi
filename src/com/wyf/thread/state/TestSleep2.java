package com.wyf.thread.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 模拟倒计时：
 */
public class TestSleep2 {

    // 模拟倒计时
    public static void tenDown() throws InterruptedException {
        int num = 10;
        while (true) {
            Thread.sleep(1000);
            System.out.println(num--);
            if(num <= 0) {
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //打印当前系统时间
        Date startTinme = new Date(System.currentTimeMillis()); // 获取当前系统时间
        while(true) {
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTinme));
            startTinme = new Date(System.currentTimeMillis()); //更新时间
        }
    }
}
