package com.layfoundation.design.mode.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *
 */
public class LogProxy implements InvocationHandler {
    private UserService userService;

    public LogProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start log");
        method.invoke(userService, args);
        System.out.println("end log");
        return null;
    }
}
