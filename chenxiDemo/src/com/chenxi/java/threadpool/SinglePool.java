package com.chenxi.java.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author cxi
 * @Date 2022/7/12 1:40
 */
public class SinglePool {
    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        int n = 10;
        for (int i = 0; i < n; i++) {
            final int index = i;
            singleThreadExecutor.execute(new MyRunnableT3(index));
        }
    }
}

class MyRunnableT3 implements Runnable {
    int i = 0;

    public MyRunnableT3(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        try {
            System.out.print(i+" ");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
