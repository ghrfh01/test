package com.interview.javabasic.Pattern.common;

import com.interview.javabasic.Pattern.Filter;
import com.interview.javabasic.Pattern.FilterImpl.Target;

public class FilterManager {
    private FilterChain filterChain;


    public FilterManager(Target target) {
        filterChain=new FilterChain();
        filterChain.setTarget(target);
    }


    public void DoFilter(Filter filter){
        filterChain.DoFilter(filter);
    }


    public void doSubmit(String request){
        filterChain.doSubmit(request);
    }
}
