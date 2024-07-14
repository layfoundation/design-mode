package com.layfoundation.design.mode.proxy.statical;

/**
 * 游戏服务实现类
 */
public class RealSubject implements Subject {
    @Override
    public void doWork() {
        System.out.println("开始工作");
    }
}
