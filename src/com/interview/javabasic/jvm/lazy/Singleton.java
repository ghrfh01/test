package com.interview.javabasic.jvm.lazy;

public class Singleton {
    private static  Singleton singleton=null;

    public static synchronized Singleton getSingleton() {
        if (null==singleton){
            singleton=new Singleton();
        }
        return singleton;
    }
}
