package com.interview.javabasic.Pattern.common;

import com.interview.javabasic.Pattern.Filter;
import com.interview.javabasic.Pattern.FilterImpl.Target;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private Target target;
    public void setTarget(Target target){
        this.target=target;
    }
    private List<Filter> filterList=new ArrayList<>();
    public void DoFilter(Filter filter){
        filterList.add(filter);
    }

    public void doSubmit(String request ){
        for (Filter filter:filterList){
            filter.execute(request);
        }
        target.execute(request);
    }
}
