package com.chenxi.java.threadpool;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author cxi
 * @Date 2022/7/12 1:34
 */
public class FixedPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(new MyRunnableT());
        }
        cachedThreadPool.shutdown();
    }
}

class MyRunnableT implements Runnable {
    @Override
    public void run() {
        System.out.println(new Date().toString());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
