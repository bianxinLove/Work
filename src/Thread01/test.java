package Thread01;

public class test {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();
        MyThread01 t2 = new MyThread01();

        t1.setName("线程1");
        t2.setName("线程2");


//        t1.setPriority(1);
//        t2.setPriority(10);
//
//        t2.setDaemon(true);
//
        t1.start();
        t2.start();

        //System.out.println(Thread.currentThread().getName());
    }
}
