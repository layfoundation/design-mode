package com.layfoundation.design.mode.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 */
public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService proxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), new LogProxy(userService));
        proxy.addUser();
    }
}
