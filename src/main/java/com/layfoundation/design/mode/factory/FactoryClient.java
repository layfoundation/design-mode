package com.layfoundation.design.mode.factory;

import com.layfoundation.design.mode.factory.abstractF.NorthPizzaIngredientFactory;
import com.layfoundation.design.mode.factory.abstractF.PizzaIngredientFactory;
import com.layfoundation.design.mode.factory.abstractF.SouthPizzaIngredientFactory;
import com.layfoundation.design.mode.factory.method.AbstractFactory;
import com.layfoundation.design.mode.factory.method.FactoryMethod;
import com.layfoundation.design.mode.factory.product.cheese.Cheese;
import com.layfoundation.design.mode.factory.product.dough.Dough;
import com.layfoundation.design.mode.factory.product.phone.Phone;
import com.layfoundation.design.mode.factory.simple.SimpleFactory;

/**
 * 【工厂模式】是一种创建型设计模式，它提供了一种创建对象的方式，使得创建对象的过程与使用对象的过程分离
 * 工厂模式违背了"开闭原则"，因为每次新增产品都需要修改工厂类
 */
public class FactoryClient {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * 【简单工厂】其实不是一个设计模式，而是一种编程习惯。
     * 它使用一个单独的工厂类来创建不同的对象，根据传入的参数决定创建哪种类型的对象
     */
    private static void testSimpleFactory() {
        SimpleFactory factory = new SimpleFactory();
        Phone iphone = factory.createPhone("iphone");
    }

    /**
     * 【工厂方法】定义了一个创建对象的接口，但由子类决定实例化哪个类。工厂方法将对象的创建延迟到子类
     */
    private static void testFactoryMethod() {
        AbstractFactory factory = new FactoryMethod();
        Phone iphone = factory.createPhone("iphone");
    }

    /**
     * 【抽象工厂】提供一个接口，用于创建一系列相关或相互依赖的对象，而无需指定它们的具体类
     */
    private static void testAbstractFactory() {
        PizzaIngredientFactory northFactory = new NorthPizzaIngredientFactory();
        Dough northADough = northFactory.createDough("A");
        Cheese northACheese = northFactory.createCheese("A");
        PizzaIngredientFactory southFactory = new SouthPizzaIngredientFactory();
        Dough southBDough = southFactory.createDough("B");
        Cheese southBCheese = southFactory.createCheese("B");
    }

}
