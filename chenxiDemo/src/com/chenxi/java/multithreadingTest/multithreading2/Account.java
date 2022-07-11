package com.chenxi.java.multithreadingTest.multithreading2;

/**
 * 银行有一个账户。 有三个储户共用该账户，账户原有8000元存款，一个储户存5000元，一个储户存6000元，一个储户取7000元，
 * 要求：每次存不能超过3000元，每次取不能超过2500元，存取次数不限制，每次存取完打印账户余额。
 * 要求使用多线程写出代码，要保证账户金额的安全性
 *
 * @Author chenxi
 */
public class Account {
    private String acccountCode;// 账户号码
    private String name;// 账户名
    private int balance;// 账户余额

    public String getAcccountCode() {
        return acccountCode;
    }

    public void setAcccountCode(String acccountCode) {
        this.acccountCode = acccountCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Account(String acccountCode, String name, int balance) {
        super();
        this.acccountCode = acccountCode;
        this.name = name;
        this.balance = balance;
    }


    public Account(int balance) {
        this.balance = balance;
    }
    //存钱方法
//    public void saveMoney(int money) {
//        if (money >= 0) {
//            //用同步代码块的方式解决线程安全问题，同步监视器为Account.class
//            synchronized (Account.class) {
//                Account.class.notify();
//                balance += money;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "存款，账户余额为：" + balance);
//                //
//                try {
//                    Account.class.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }else{
//            //用同步代码块的方式解决线程安全问题，同步监视器为Account.class
//                synchronized (Account.class) {
//                    Account.class.notify();
//                    balance -= money;
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName() + "存款，账户余额为：" + balance);
//                    //
//                    try {
//                        Account.class.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//
//        }
//    }

    // 存钱

    public synchronized void wit2(int money) {
        String name = Thread.currentThread().getName();
        balance += money;
        System.out.println(name + "从账户第一次！！！！！" + getAcccountCode() + "存" + money + "元，当前余额为" + balance + "元");
        // 钱存好了，马上释放this这个锁了，这里可以叫醒其他线程，让他们从等待池进入到锁池
        // 这个锁一旦释放，那么就锁池中的线程就会进入到就绪状态，争夺执行权以及获取锁对象，然后再执行代码
        this.notifyAll();
    }

    public synchronized void pos2(int money) {
        String name = Thread.currentThread().getName();
        while (balance < money) {
            try {
                this.wait();// 等待存钱线程执行完以后执行，这样就避免了线程冲突，防止了死锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= money;
        System.out.println(name + "从账户第一次！！！！！" + getAcccountCode() + "取" + money + "元，当前余额为" + balance + "元");
    }


    public synchronized void pos(int money) {
        String name = Thread.currentThread().getName();
        balance += money;
        System.out.println(name + "从账户" + getAcccountCode() + "存" + money + "元，当前余额为" + balance + "元");
        // 钱存好了，马上释放this这个锁了，这里可以叫醒其他线程，让他们从等待池进入到锁池
        // 这个锁一旦释放，那么就锁池中的线程就会进入到就绪状态，争夺执行权以及获取锁对象，然后再执行代码
        this.notifyAll();
    }

    // 取钱
    public synchronized void wit(int money) {
        String name = Thread.currentThread().getName();
        while (balance < money) {
            try {
                this.wait();// 等待存钱线程执行完以后执行，这样就避免了线程冲突，防止了死锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        balance -= money;
        System.out.println(name + "从账户" + getAcccountCode() + "取" + money + "元，当前余额为" + balance + "元");
    }

}
