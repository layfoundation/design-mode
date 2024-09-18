package com.layfoundation.design.mode.decorator;

import com.layfoundation.design.mode.decorator.component.Shape;

/**
 * 抽象装饰类
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
