package com.interview.javabasic.jvm.sunxu;

public class Runner {
    // 静态方法》非静态方法
    // 父类》》子类
    // 代码块》》字段》》构造方法
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++first+++++++++++++++++++++++++++++");
        new Cat();
        System.out.println("+++++++++++++++++++++second++++++++++++++++++++++++++++");
        new Cat();
    }
}