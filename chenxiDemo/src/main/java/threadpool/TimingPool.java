package threadpool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author cxi
 * @Date 2022/7/12 1:36
 */
public class TimingPool {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
        System.out.println(new Date().toString());
        scheduledThreadPool.schedule(new MyRunnableT2(), 3, TimeUnit.SECONDS);
    }
}

class MyRunnableT2 implements Runnable {
    @Override
    public void run() {
        System.out.println(new Date().toString());
    }
}
