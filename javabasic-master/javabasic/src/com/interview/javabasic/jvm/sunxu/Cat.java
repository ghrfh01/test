package com.interview.javabasic.jvm.sunxu;

public class Cat extends Animal {
    static Sing s2=new Sing(2,"cat\t\tstatic field");
    static Sing s3;
    Sing s4;
    Sing s5;
    
    static{
        s3=new Sing(3,"cat\t\tstatic code area");
    }
    Cat(){
        s5=new Sing(5,"cat\t\tconstructor");
    }
    {
        
        s4=new Sing(4,"cat\t\tnot static code area");
    }
    Sing s1=new Sing(1,"cat\t\tnot static field");


}