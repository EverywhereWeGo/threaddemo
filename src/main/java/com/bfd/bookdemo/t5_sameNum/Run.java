package com.bfd.bookdemo.t5_sameNum;

class MyThread extends Thread {
    private int i = 5;

    public void run() {
        System.out.println("i=" + (i--) + ",threadName=" + Thread.currentThread().getName());
    }
}


public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread);
        Thread b = new Thread(myThread);
        Thread c = new Thread(myThread);
        Thread d = new Thread(myThread);
        Thread e = new Thread(myThread);

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
