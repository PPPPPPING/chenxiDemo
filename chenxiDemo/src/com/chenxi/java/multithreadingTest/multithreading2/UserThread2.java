package com.chenxi.java.multithreadingTest.multithreading2;


public class UserThread2 extends Thread {
    private Account account;

    public UserThread2(Account account, String name) {
        super(name);
        this.account = account;
    }


    @Override
    public void run() {
        while (true) {
            //生成随机钱的数量
            int money = (int) (Math.random()*(3000-0+1)+0);
            //实现随机存钱
            account.pos(money);
            try {
                //当存完钱后进去休眠，然会让其他线程进行操作
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
