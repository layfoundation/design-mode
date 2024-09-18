package com.layfoundation.design.mode.proxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibLogProxy implements MethodInterceptor {
    UserService userService;

    public CglibLogProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("start log");
        Object result = method.invoke(userService, objects);
        System.out.println("end log");
        return result;
    }
}
