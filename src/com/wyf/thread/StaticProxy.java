package com.wyf.thread;

/**
 * 静态代理模式
 *
 *真实对象和代理对象都要实现同一接口
 * 代理对象要代理真实角色
 *
 * 好处：代理对象可以做很多真实对象做不了的事情
 *       真实对象专注做自己的事情
 *
 *  多线程的new Thread(Runnable).start()
 */
public class StaticProxy {
    public static void main(String[] args) {

        WeddingCompany weddingCompany = new WeddingCompany(new You());

        weddingCompany.HappyMarry();
    }
}


interface Marry {
    void HappyMarry();
}

// 真实角色
class You implements Marry {
    @Override
    public void HappyMarry() {
        System.out.println("要结婚了");
    }
}

// 代理角色
class WeddingCompany implements Marry {

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void after() {
        System.out.println("结婚之后收钱");
    }

    private void before() {
        System.out.println("结婚之前布置");
    }
}