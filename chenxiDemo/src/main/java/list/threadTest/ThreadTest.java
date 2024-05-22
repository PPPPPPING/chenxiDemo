package list.threadTest;


public class ThreadTest {

    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            if (i %2 == 0){
                System.out.println(i+"0000000000000");
            }

        }
        System.out.println(Thread.currentThread().getName());
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i %2 == 0){
                System.out.println(i);
            }

        }
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() + "-->我是通过实现接口的线程实现方式！");
    }

}



