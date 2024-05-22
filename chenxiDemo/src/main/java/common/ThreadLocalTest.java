package common;

/**
 * @Author ping
 * @Date 2024/3/5 22:47
 * @Description
 */
public class ThreadLocalTest {

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Task 1"));
        Thread t2 = new Thread(new Task("Task 2"));

        t1.start();
        t2.start();
    }

    static class Task implements Runnable {
        private String name;

        Task(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                int value = threadLocal.get();
                System.out.println(name + " - ThreadLocal value: " + value);
                threadLocal.set(value + 1);
                try {
                    Thread.sleep(1000); // 模拟耗时操作
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

