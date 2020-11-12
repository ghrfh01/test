package com.interview.javabasic.jvm.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ReferenceQueueTest {
    private static ReferenceQueue<com.interview.javabasic.jvm.gc.NormalObject> rq = new ReferenceQueue<com.interview.javabasic.jvm.gc.NormalObject>();

    private static void checkQueue(){
        Reference<com.interview.javabasic.jvm.gc.NormalObject> ref = null;
        while ((ref = (Reference<com.interview.javabasic.jvm.gc.NormalObject>)rq.poll()) != null){
            if (ref != null){
                System.out.println("In queue: " + ((com.interview.javabasic.jvm.gc.NormalObjectWeakReference)(ref)).name);
                System.out.println("reference object:" + ref.get());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<WeakReference<com.interview.javabasic.jvm.gc.NormalObject>> weakList = new ArrayList<WeakReference<com.interview.javabasic.jvm.gc.NormalObject>>();
        for (int i =0; i < 3 ; i++){
            weakList.add(new com.interview.javabasic.jvm.gc.NormalObjectWeakReference(new com.interview.javabasic.jvm.gc.NormalObject("Weak " + i),rq));
            System.out.println("Created weak:" + weakList.get(i));
        }
        System.out.println("first time");
        checkQueue();
        System.gc();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("second time");
        checkQueue();
    }
}
