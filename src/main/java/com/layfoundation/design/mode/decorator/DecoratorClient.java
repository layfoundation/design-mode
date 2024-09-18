package com.layfoundation.design.mode.decorator;

import com.layfoundation.design.mode.decorator.component.Shape;
import com.layfoundation.design.mode.decorator.component.impl.Circle;

/**
 * 【装饰器模式】允许向一个现有的对象添加新的功能，同时又不改变其结构
 * 【使用场景】
 * 当需要在不增加大量子类的情况下扩展类的功能。
 * 当需要动态地添加或撤销对象的功能。
 * 【优缺点】
 * 优点
 * 低耦合：装饰类和被装饰类可以独立变化，互不影响。
 * 灵活性：可以动态地添加或撤销功能。
 * 替代继承：提供了一种继承之外的扩展对象功能的方式。
 * 缺点
 * 复杂性：多层装饰可能导致系统复杂性增加。
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        ShapeDecorator redDecorator = new RedShapeDecorator(new Circle());
        redDecorator.draw();
    }
}
