package com.interview.javabasic.thread;

public class ReplaceDemo {
    Object o=new Object();

    public static void main(String[] args) throws InterruptedException {
        ReplaceDemo replaceDemo=new ReplaceDemo();
        replaceDemo.test1();
    }

    public synchronized void test() throws InterruptedException {
        o.wait();
        System.out.println("test");
    }

    public  void test1() throws InterruptedException {
        o.wait();
        System.out.println("test");
        Thread.yield();;
    }
}
