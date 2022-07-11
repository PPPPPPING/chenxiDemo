package com.chenxi.java.multithreadingTest.multithreading2;


public class UserThread3 extends Thread {
    private Account account;

    public UserThread3(Account account, String name) {
        super(name);
        this.account = account;
    }


    @Override
    public void run() {
        while (true) {
            int money = (int) (Math.random() * (3000 - 0 + 1) + 0);
            //实现随机存钱
            account.pos(money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}