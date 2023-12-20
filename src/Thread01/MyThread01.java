package Thread01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread01 extends Thread{
    static int ticket = 0;
    //static Object object = new Object();

    static Lock lock = new ReentrantLock();
    public MyThread01() {
    }

    public MyThread01(String name) {
        super(name);
    }

    @Override
    public void run() {
        while ( true )
        {
//            synchronized (MyThread01.class)
//            {
                lock.lock();
                try {
                    if ( ticket < 100 )
                    {
                        Thread.sleep(10);
                        ticket ++;
                        if ( ticket % 2 != 0 ) System.out.println(getName()+"现在出售第"+ticket+"张票");
                        //if ( ticket % 2 != 0 ) System.out.println(ticket);
                    }else
                    {
                        break;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
//            }
        }
    }
}