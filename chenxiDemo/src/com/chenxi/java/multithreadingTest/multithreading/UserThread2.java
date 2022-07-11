package com.chenxi.java.multithreadingTest.multithreading;


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
            int money = (int) (Math.random() * 3000);
            //实现随机存钱
            account.pos2(money);
            try {
                //当存完钱后进去休眠，然会让其他线程进行操作
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (account.sum2 >= 5000) {
                return;
            }
        }
    }
}
