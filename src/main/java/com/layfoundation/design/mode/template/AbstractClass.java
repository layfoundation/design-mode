package com.layfoundation.design.mode.template;

/**
 * 模板方法模式
 * 抽象类
 */
public abstract class AbstractClass {
    public void templateMethod() {
        step1();
        step2();
        step3();
        // 钩子方法
        if (hook()) {
            step4();
        }
    }

    protected abstract void step1();

    void step2() {
        System.out.println("templateMethod.step2");
    }

    protected abstract void step3();

    protected abstract void step4();

    protected boolean hook() {
        return true;
    }
}
