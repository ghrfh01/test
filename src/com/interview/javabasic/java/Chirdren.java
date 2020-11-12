package com.interview.javabasic.java;

public class Chirdren extends Parent {


    public static void main(String[] args) {
        Chirdren parent=new Chirdren();
        parent.test();
    }

    public Chirdren() {
        super();
    }

    @Override
    public void test() {
        super.test();
        System.out.println(2);
    }

    @Override
    public void test1() {
        System.out.println("test2");
    }
}
