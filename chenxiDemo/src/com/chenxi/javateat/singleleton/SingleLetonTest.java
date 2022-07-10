package com.chenxi.javateat.singleleton;

public class SingleLetonTest {
    public static void main(String[] args) {
       Bank bank1 = Bank.getInstance();
        System.out.println(bank1);
    }
}

class Bank{

    //私有化类的构造器
    private Bank(){
        System.out.println("银行");
    }
    //2内部创建类的对象
    //private Bank instance = new Bank();
    //4要求此类对象也必须声明为静态的
    private static Bank instance = new Bank();
    //3提供公共的静态方法  返回类的对象
//    private Bank getInstance
    public static Bank getInstance(){
        return instance;
    }
}
