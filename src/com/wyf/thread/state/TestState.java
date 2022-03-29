package com.wyf.thread.state;

/**
 * 观察测试线程的状态
 */
public class TestState {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()-> {
            for (int i = 0; i <5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("//////");
        });
        
        // 观察状态
        Thread.State state = thread.getState();
        System.out.println(state); //NEW

        //观察启动后
        thread.start();
        state = thread.getState();
        System.out.println(state); //RUNNABLE

        while (state != Thread.State.TERMINATED) { //线程不终止输出
            Thread.sleep(100);
            state = thread.getState();
            System.out.println(state);//TIMED_WAITING
            //TERMINATED
        }

    }
}
