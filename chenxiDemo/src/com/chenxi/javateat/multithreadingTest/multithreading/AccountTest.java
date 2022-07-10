package com.chenxi.javateat.multithreadingTest.multithreading;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("银行", "User1", 8000);
        UserThread u1 = new UserThread(account, "User1");
        UserThread2 u2 = new UserThread2(account, "User2");
        UserThread3 u3 = new UserThread3(account, "User3");
        u1.start();
        u2.start();
        u3.start();

    }
}
