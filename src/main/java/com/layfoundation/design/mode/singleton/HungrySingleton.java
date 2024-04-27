package com.layfoundation.design.mode.singleton;

/**
 * 饿汉式单例
 * 优点：线程安全
 * 缺点：类加载时就初始化，浪费内存
 * 适用场景：单例对象较小，初始化耗时较短
 * 参考文章：https://www.cnblogs.com/yoga21/p/9224557.html
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
