package com.wyf.thread.syn;

import java.util.ArrayList;
import java.util.List;

/**
 * 线程不安全的集合
 */
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();  // 同一时间插入
        }
        while (true) {
            if(list.size() == 1000) {
                System.out.println("list为1000");
                break;
            }else {
                System.out.println("list为" + list.size());
            }
        }
    }
}
