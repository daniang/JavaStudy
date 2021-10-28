package com.Thread;

public class TestThread {

    public static void main(String[] args) {
//        RunnalbeDemo r1 = new RunnalbeDemo("Thread-1");
//        r1.start();
//
//        RunnalbeDemo r2 = new RunnalbeDemo("Thread -2");
//        r2.start();


        ThreadDemo t1 = new ThreadDemo("Thread-1");
        t1.start();
        ThreadDemo t2 = new ThreadDemo("Thread -2");
        t2.start();
    }
}
