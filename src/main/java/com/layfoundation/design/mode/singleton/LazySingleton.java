package com.layfoundation.design.mode.singleton;

/**
 * 懒汉式单例
 * 双重检查锁。注意volatile关键字
 * 【优点】：懒加载，线程安全
 * 【缺点】：性能较差
 * 【适用场景】：单例对象较大，初始化耗时较长
 * 参考文章：https://www.cnblogs.com/yoga21/p/9224557.html
 */
public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
