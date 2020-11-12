package com.interview.javabasic.jvm.model;

public class InternDifference {
    public static void main(String[] args) {
//        String s = new String("a");
//        s.intern();
//        String s2 = "a";
//        System.out.println(s == s2);
//
//        String s3 = new String("a") + new String("a");
//        // 将数据放在常量池里面
//        s3.intern();
        String s5 = "aa";
        String s4 = "aa";
//        System.out.println(s3 == s4);
        System.out.println(s5 == s4);

    }
}
