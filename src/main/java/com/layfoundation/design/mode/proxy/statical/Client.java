package com.layfoundation.design.mode.proxy.statical;

/**
 * 【代理模式】
 * 【定义】
 * 为另一个对象提供一个替身或占位符以控制对这个对象的访问。被代理的对象可以是远程对象、创建开销大的对象或需要安全控制的对象。
 * 【分类】
 * 结构性模式
 * 【与其它模式对比】
 * 与适配器模式的区别：适配器模式改变接口，而代理模式不改变接口。
 * 与装饰器模式的区别：装饰器模式用于增强功能，代理模式用于控制访问
 */
public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        SubjectProxy subjectProxy = new SubjectProxy(realSubject);
        subjectProxy.doWork();
    }
}
