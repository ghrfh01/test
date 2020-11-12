package com.interview.javabasic.java;

public class Outer {

    void outMethod(){
        int a =10;
        class Inner {
            void innerMethod(){
                System.out.println(a);
            }

        }
        String str="q";
        str.hashCode();
    }
}