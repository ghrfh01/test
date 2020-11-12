package com.interview.javabasic.java;

public class ChirdrenA implements A{

    private void test1(){

    }
    @Override
    public Outer test() throws NullPointerException{
        return null;
    }

    public static void main(String[] args) {
        try {
            try {
                throw new Sneeze();
            } catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } catch ( Exception s ) {
            System.out.println("Caught Sneeze"+s);
            return ;
        } finally {
            System.out.println("Hello World!");
        }
    }
}
