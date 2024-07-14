package com.layfoundation.design.mode.proxy.statical;

/**
 * 代理类
 */
public class SubjectProxy implements Subject {
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doWork() {
        System.out.println("代理开始");
        subject.doWork();
        System.out.println("代理结束");
    }
}
