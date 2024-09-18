package com.layfoundation.design.mode.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class CglibClient {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(userService.getClass());
        enhancer.setCallback(new CglibLogProxy(userService));
        UserService proxy = (UserService) enhancer.create();
        proxy.addUser();
    }
}
