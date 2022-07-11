package com.chenxi.java.threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author cxi
 * @Date 2022/7/12 1:38
 */
public class CyclicPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        System.out.println(new Date().toString());
        scheduledThreadPool.scheduleAtFixedRate(new MyRunnable(), 1, 3, TimeUnit.SECONDS);
        try {
            Thread.sleep(15 * 1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        scheduledThreadPool.shutdown();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(new Date().toString());
    }
}
