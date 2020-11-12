package com.interview.javabasic.jvm.sunxu;

public class Animal {


        static Sing s3;
        Sing s4;
        Sing s5;
        
        static{
            s3=new Sing(3,"animal\tstatic code area");
        }
        static Sing s2=new Sing(2,"animal\tstatic field");
        Animal(){
        s5=new Sing(5,"animal\tconstructor");
    }
        {
            
            s4=new Sing(4,"animal\tnot static code area");
        }
        Sing s1=new Sing(1,"animal\tnot static field");

    }