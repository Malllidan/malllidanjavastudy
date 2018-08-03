package com.myjava.ThreadAbout;

/**
 * synchronized关键字：对于被 synchronized标记的块和对象方法，只能有拿到对象锁的进程可以进行
 * 对于被 synchronized标记的类块和静态方法，只能有拿到类锁的进程可以进行。
 * （缺陷：当某个线程进入同步方法获得对象锁，那么其他线程访问这里对象的同步方法时，必须等待或者阻塞，
 * 如果某个线程在同步方法里面发生了死循环，那么它就永远不会释放这个对象锁，那么其他线程就要永远的等待。这是一个致命的问题。）。
 * （解决方法：同步代码块可以降风险降低，比如A的对象a的方法里调用了b.mtho（），可以只获取b的对象锁，a的其他同步方法不会阻塞。）
 * 一个线程可以同时拿A类的对象锁和B类的对象锁，不同类对象锁不影响
 */

public class ThreadTest {
    public void test1()
    {
        synchronized(this)
        {
            int i = 5;
            while( i-- > 0)
            {
                System.out.println(Thread.currentThread().getName() + " : " + i);
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException ie)
                {
                }
            }
        }
    }
    public synchronized void test2()
    {
        int i = 5;
        while( i-- > 0)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException ie)
            {
            }
        }
    }
    public static void main(String[] args)
    {
        final ThreadTest myt2 = new ThreadTest();
        final ThreadTest myt1=new ThreadTest();
        Thread test1 = new Thread(  new Runnable() {  public void run() {  myt2.test1();  }  }, "test1"  );
        Thread test2 = new Thread(  new Runnable() {  public void run() { myt2.test2();   }  }, "test2"  );//同一个对象锁
        test1.start();;
        test2.start();
//         TestRunnable tr=new TestRunnable();
//         Thread test3=new Thread(tr);
//         test3.start();
    }

}
