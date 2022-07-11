package com.chenxi.java.multithreadingTest.multithreading;


public class UserThread3 extends Thread {
    private Account account;

    public UserThread3(Account account, String name) {
        super(name);
        this.account = account;
    }



    @Override
    public void run() {
        while (true) {
            int money = (int) (Math.random() * 3000);
            //实现随机存钱
            account.pos3(money);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (account.sum3 >= 6000) {
                return;

            }
        }
    }
}