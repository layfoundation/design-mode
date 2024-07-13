package com.layfoundation.design.mode;

import com.layfoundation.design.mode.factory.method.AbstractFactory;
import com.layfoundation.design.mode.factory.method.FactoryMethod;
import com.layfoundation.design.mode.factory.product.Phone;
import com.layfoundation.design.mode.template.ConcreteClass;

public class Client {
    public static void main(String[] args) {
        testTemplateMethod();
        System.out.println("Hello World!");
    }

    private static void testFactoryMethod() {
        AbstractFactory factory = new FactoryMethod();
        Phone iphone = factory.createPhone("iphone");
    }

    private static void testTemplateMethod() {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }
}
