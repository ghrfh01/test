package com.interview.javabasic.AbstractFactory;

public class AServiceProxy implements AdminService {
    private AdminService adminService;

    public AServiceProxy(AdminService adminService) {
        this.adminService = adminService;
    }

    @Override
    public void update() {
        adminService.update();
    }

    @Override
    public Object find() {
        adminService.find();
        return null;
    }
}
