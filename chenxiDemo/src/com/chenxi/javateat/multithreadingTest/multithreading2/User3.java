package com.chenxi.javateat.multithreadingTest.multithreading2;

public class User3 extends Thread {

    private Account account;

    //有参构造器
    public User3(Account account, String user3) {
        this.account = account;
    }
    //重写run方法
    @Override
    public void run() {
        while(true) {
            //定义一个随机的钱的数量
            int money = 7000;
            account.pos2(money);
            try {
                //取完钱后睡眠会，让其他线程运行
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return;
        }
    }
}