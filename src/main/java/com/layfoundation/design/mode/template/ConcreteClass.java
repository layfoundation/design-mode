package com.layfoundation.design.mode.template;

/**
 * 模板方法模式
 * 具体实现类
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void step1() {
        System.out.println("templateMethod.step1");
    }

    @Override
    protected void step3() {
        System.out.println("templateMethod.step3");
    }

    @Override
    protected void step4() {
        System.out.println("templateMethod.step4");
    }
}
