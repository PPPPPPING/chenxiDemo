package com.chenxi.javateat.multithreadingTest.multithreading;

public class UserThread extends Thread {
    private Account account;


    public UserThread(Account account, String name) {
        super(name);
        this.account = account;
    }


    @Override
    public void run() {
        while (true) {
            //定义一个随机的钱的数量
            int money = (int) (Math.random() * 2500);
            try {
                //调用取钱的方法进行随机取钱
                account.wit(money);
                //取完钱后睡眠会，让其他线程运行
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (account.sum >= 7000) {
                return;
            }
        }
    }


}



