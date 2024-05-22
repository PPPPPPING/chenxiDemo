package common;

/**
 * @Author ping
 * @Date 2024/4/18 22:16
 * @Description
 */
public class PrintABC {
    private static Object lock = new Object();
    private static int state = 0;

    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintTask("a", 0));
        Thread threadB = new Thread(new PrintTask("b", 1));
        Thread threadC = new Thread(new PrintTask("c", 2));

        threadA.start();
        threadB.start();
        threadC.start();
    }

    static class PrintTask implements Runnable {
        private String content;
        private int myState;

        public PrintTask(String content, int myState) {
            this.content = content;
            this.myState = myState;
        }

        @Override
        public void run() {
            synchronized (lock) {
                while (state % 3 != myState) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.print(content);

                state++;
                lock.notifyAll();
            }
        }
    }
}

