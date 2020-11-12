package com.interview.javabasic.AbstractFactory;

public class AServiceImpl implements AdminService {
    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public Object find() {
        return null;
    }
}
