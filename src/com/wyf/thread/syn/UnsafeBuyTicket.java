package com.wyf.thread.syn;

/**
 * 不安全买票
 */
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();

        new Thread(buyTicket, "wyf1").start();
        new Thread(buyTicket, "wyf2").start();
        new Thread(buyTicket, "wyf3").start();
    }
}


class BuyTicket implements Runnable {

    // 票
    private int ticketNum = 10;
    boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }

    // synchronized同步方法，锁的是this
    private synchronized void buy() {
        // 判断是否有票
        if(ticketNum <= 0) {
            flag = false;
            return;
        }
        // 模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 买票
        System.out.println(Thread.currentThread().getName() + "拿到" + ticketNum--);
    }
}
