package com.interview.javabasic.Pattern.common;

import com.interview.javabasic.Pattern.FilterImpl.AuthenticationFilter;
import com.interview.javabasic.Pattern.FilterImpl.Target;
import com.interview.javabasic.Pattern.FilterImpl.DebugFilter;

public class Test {
    public static void main(String[] args) {
        Target target=new Target();
        FilterManager filterManager=new FilterManager(target);
        filterManager.DoFilter(new DebugFilter());
        filterManager.DoFilter(new AuthenticationFilter());

        Client client=new Client();
        client.setFilterManager(filterManager);
        client.doSubmit("1");
    }
}
