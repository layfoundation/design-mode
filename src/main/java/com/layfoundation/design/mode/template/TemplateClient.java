package com.layfoundation.design.mode.template;

/**
 * 模板方法模式
 * 【定义】
 * 在操作中定义算法的框架，将一些步骤推迟到子类中。模板方法让子类在不改变算法结构的情况下重新定义算法的某些步骤
 */
public class TemplateClient {
    public static void main(String[] args) {
        testTemplateMethod();
        System.out.println("Hello World!");
    }

    private static void testTemplateMethod() {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }
}
