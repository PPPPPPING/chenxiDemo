package com.chenxi.java.multithreadingTest.multithreading2;

public class AccountTest {
    public static void main(String[] args) {

        Account account = new Account("银行", "User2", 8000);

        User user1 = new User(account,"User1");
        user1.setName("User1");
        user1.start();
        User2 user2 = new User2(account,"User1");
        user2.setName("User2");
        user2.start();
        User3 user3 = new User3(account,"User1");
        user3.setName("User3");
        user3.start();
        UserThread u1 = new UserThread(account, "User1");
        UserThread2 u2 = new UserThread2(account, "User2");
        UserThread3 u3 = new UserThread3(account, "User3");
        u1.start();
        u2.start();
        u3.start();


    }

}
