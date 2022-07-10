package com.chenxi.javateat.multithreadingTest.multithreading;

/**
 * 银行有一个账户。 有三个储户共用该账户，账户原有8000元存款，一个储户存5000元，一个储户存6000元，一个储户取7000元，
 * 存取完成之后每个用户可以存钱和取钱，每次存不能超过3000元，每次取不能超过2500元，存取次数不限制，每次存取完打印账户余额。
 * 要求使用多线程写出代码，要保证账户金额的安全性
 *
 * @Author chenxi
 */

public class Account {

    private UserThread userThread;
    private UserThread2 userThread2;
    private UserThread3 userThread3;
    private String acccountCode;// 账户号码
    private String name;// 账户名
    private int balance;// 账户余额
    public int sum;
    public int overNum;
    public int sum2;
    public int overNum2;
    public int sum3;
    public int overNum3;
    public int shouldNum1;
    public int shouldNum2;
    public int shouldNum3;

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


    // 取钱
    public synchronized void wit(int money) {
        String name = Thread.currentThread().getName();
        if (balance < money) {
            try {
                this.wait();// 等待存钱线程执行完以后执行，这样就避免了线程冲突，防止了死锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sum += money;
        if (sum > 7000) {
            //超过部分的前
            overNum = sum - 7000;
            //余额
            balance -= money;
            //最后一次应该要取的钱
//            shouldNum1 = userThread.money1 - (sum - 7000) ;
            System.out.println(name + "从账户" + getAcccountCode() + "取" + money + "元，当前余额为" + balance + "元" + "\t" + "\t" + name + "您取超过7000，在这停止！！！！！！！！！您多取了" + overNum
                    + "！！！！！！！！！" + "加上多取的，账户总余额变成" + (balance + overNum));
            balance = (balance + overNum);
        } else {
            balance -= money;
            System.out.println(name + "从账户" + getAcccountCode() + "取" + money + "元，当前余额为" + balance + "元");
        }

    }


    //存钱
    public synchronized void pos2(int money) {
        String name = Thread.currentThread().getName();
        sum2 += money;
        if (sum2 > 5000) {
            overNum2 = sum2 - 5000;
            balance += money;
//            shouldNum2 = userThread2.money2 - (sum2 - 5000) ;
            System.out.println(name + "从账户" + getAcccountCode() + "存" + money + "元，当前余额为" + balance + "元" + "\t" + "\t" + name + "您存超过5000，在这停止！！！！！！！！！您多存了" + overNum2
                    + "！！！！！！！！！" + "扣掉多存的，账户总余额变成" + (balance - overNum2));
            balance = (balance - overNum2);
        } else {
            balance += money;
            System.out.println(name + "从账户" + getAcccountCode() + "存" + money + "元，当前余额为" + balance + "元");
            // 钱存好了，马上释放this这个锁了，这里可以叫醒其他线程，让他们从等待池进入到锁池
            // 这个锁一旦释放，那么就锁池中的线程就会进入到就绪状态，争夺执行权以及获取锁对象，然后再执行代
            this.notifyAll();
        }

    }


    //    存钱
    public synchronized void pos3(int money) {
        String name = Thread.currentThread().getName();

        sum3 += money;
        if (sum3 > 6000) {
            overNum3 = sum3 - 6000;
            balance += money;
//            shouldNum3 = userThread3.money3 - (sum3 - 6000) ;
            System.out.println(name + "从账户" + getAcccountCode() + "存" + money + "元，当前余额为" + balance + "元" + "\t" + "\t" + name + "您存超过6000，在这停止！！！！！！！！！您多存了" + overNum3
                    + "！！！！！！！！！" + "扣掉多存的，账户总余额变成" + (balance - overNum3));
            balance = (balance - overNum3);
        } else {
            balance += money;
            System.out.println(name + "从账户" + getAcccountCode() + "存" + money + "元，当前余额为" + balance + "元");
            // 钱存好了，马上释放this这个锁了，这里可以叫醒其他线程，让他们从等待池进入到锁池
            // 这个锁一旦释放，那么就锁池中的线程就会进入到就绪状态，争夺执行权以及获取锁对象，然后再执行代
            this.notifyAll();
        }
    }


}
