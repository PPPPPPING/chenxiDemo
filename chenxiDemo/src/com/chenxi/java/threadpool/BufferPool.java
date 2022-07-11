package com.chenxi.java.threadpool;


import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author cxi
 * @Date 2022/7/12 1:25
 */
public class BufferPool {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            cachedThreadPool.execute(new MyRunnableT4());
        }
        cachedThreadPool.shutdown();
    }
}

class MyRunnableT4 implements Runnable {
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
