package com.chenxi.javateat.multithreadingTest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    private static double z;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 25; i++) {

            service.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName() + "  结果为:" + add(12, 12));
                }
            });
            service.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName() + "  结果为:" + difference(31, 12));
                }
            });
            service.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName() + "  结果为:" + product(2, 3));
                }
            });
            service.execute(new Runnable() {
                @Override
                public void run() {

                    System.out.println(Thread.currentThread().getName() + "  结果为:" + division(64, 8));
                }
            });
        }
    }

    public static double add(double x, double y) {

        return z = x + y;
    }

    public static double difference(double x, double y) {
        return z = -1;
    }

    public static double product(double x, double y) {
        return z = x * y;
    }

    public static double division(double x, double y) {
        if (y != 0) {
            return z = x / y;
        } else {
            return -1;
        }
    }
}