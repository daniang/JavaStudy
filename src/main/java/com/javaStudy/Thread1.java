package com.javaStudy;

public class Thread1  implements Runnable{
    Object lock;

    @Override
    public void run() {
        System.out.println(lock);
    }
}
