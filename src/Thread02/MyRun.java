package Thread02;

import Thread01.MyThread01;

public class MyRun implements Runnable{

    int ticket = 0;

    @Override
    public void run() {
        while ( true )
        {
            if (method()) break;
        }
    }

    private synchronized boolean method() { //非静态的，对应的锁对象就是this，this就是唯一的！！！！
        if ( ticket < 100 )
        {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            ticket ++;
            System.out.println(Thread.currentThread().getName()+"现在出售第"+ticket+"张票");
        }else
        {
            return true;
        }
        return false;
    }
}
