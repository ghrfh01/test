package com.interview.javabasic.Pattern.common;

import com.interview.javabasic.Pattern.Filter;
import com.interview.javabasic.Pattern.FilterImpl.Target;

public class Client {
   private FilterManager filterManager;
   public void setFilterManager(FilterManager filterManager){
       this.filterManager=filterManager;
   }


   public void doSubmit(String test){
       filterManager.doSubmit(test);
   }

}
