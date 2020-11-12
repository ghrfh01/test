package com.interview.javabasic.Pattern.FilterImpl;

import com.interview.javabasic.Pattern.Filter;

public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("two:"+request);
    }
}
