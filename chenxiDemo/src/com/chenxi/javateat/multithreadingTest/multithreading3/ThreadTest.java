package com.chenxi.javateat.multithreadingTest.multithreading3;

/**
 * 银行有一个账户。 有三个储户共用该账户，账户原有8000元存款，一个储户存5000元，一个储户存6000元，一个储户取7000元，
 * 要求：每次存不能超过3000元，每次取不能超过2500元，存取次数不限制，每次存取完打印账户余额。
 * 要求使用多线程写出代码，要保证账户金额的安全性
 */
public class ThreadTest {
    public static void main(String[] args) {
        Account account = new Account(0);
        //创建两个User对象 （两个线程）
        User u1 = new User(account);
        //为两个对象（线程）命名
        u1.setName("User1");
        u1.start();
    }
}

class Account {
    //账户余额为money
    private double money ;

    //有参构造器
    public Account(double money) {
        this.money = money;
    }
    //存钱方法
    public void saveMoney(double num) {
        if (num > 0) {
            //用同步代码块的方式解决线程安全问题，同步监视器为Account.class
            synchronized (Account.class) {
                Account.class.notify();
                money = 5000;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "存款，账户余额为：" + money);
                //
                try {
                    Account.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class User extends Thread {
    private Account account;
    //有参构造器
    public User(Account account) {
        this.account = account;
    }
    //重写run方法
    @Override
    public void run() {
            account.saveMoney(5000);
    }
}



