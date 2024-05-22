package multithreadingTest;


import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TaskQueueController {
    //有返回结果的多线程
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        AtomicInteger count = new AtomicInteger(0);
        System.out.println("----任务开始执行----");
        //创建一个线程池
        int taskSize = 4;
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);
        //创建多个有返回值的任务，队列,拿任务的执行结果
//        List<Future> list = new ArrayList<Future>();
        BlockingQueue<Future<Object>> queue = new LinkedBlockingQueue<>();
        // 向里面扔任务
        for (int i = 0; i < taskSize; i++) {
//            Callable c = new MyCallable(i + " ");
            //执行任务并获取Future对象
//            Future f = pool.submit(c);
            Future<Object> future = pool.submit(new MyCallable("ExecTask" + i));
            queue.add(future);
        }
        // 检查线程池任务执行结果
        for (int i = 0; i < taskSize; i++) {
            Object sleptTime = queue.take().get();
            //System.out.println(" slept "+sleptTime+" ms ...");
            count.addAndGet((Integer) sleptTime);
        }
        // 关闭线程池
        pool.shutdown();
        for (Future f : queue) {
            System.out.println(">>>" + f.get().toString());
        }
    }


    static class MyCallable implements Callable<Object> {
        private final String taskNum;

        MyCallable(String taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public Integer call() throws Exception {
            int sleepTime = new Random().nextInt(1000);
            try {
                System.out.println(">>>" + taskNum + "任务启动");
                Thread.sleep(sleepTime);
                System.out.println(">>>" + taskNum + "任务终止");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 返回给调用者的值
            return sleepTime;
        }

//        public Object call() throws Exception {
//            System.out.println(">>>" + taskNum + "任务启动");
//            Thread.sleep(1000);
//            System.out.println(">>>" + taskNum + "任务终止");
//            return taskNum + "任务返回运行结果";
//        }
    }

}

