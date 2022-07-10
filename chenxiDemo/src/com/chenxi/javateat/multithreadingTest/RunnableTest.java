package com.chenxi.javateat.multithreadingTest;

/**
 * @Author chenxi
 * @create 2022/6/26 22:52
 */
public class RunnableTest {
    public static void main(String[] args) {
        //创建实现类的对象
        MThread mThread = new MThread();
        //将此对象作为参数传递到Thread类的构造器中!!!创建Thread类的对象
        Thread t1 = new Thread(mThread);
        //通过Thread类的对象调用start()：①启动线程②调用当前线程的run()-->调用了Runnable类型的target的run()
        t1.setName("线程一");
        t1.start();
        //在启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread(mThread);
        t2.setName("线程二");
        t2.start();
    }
}
//创建一个实现了Runnable接口的类
class MThread implements Runnable{
    //实现类去实现Runnable中的抽象方法run()
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i%2 ==0){
                System.out.println(Thread.currentThread().getName()+":"+i);  //这里不能直接写geiName(),因为不是继承的Thread
            }
        }
    }
}