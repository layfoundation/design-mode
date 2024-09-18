package com.layfoundation.design.mode.decorator;

import com.layfoundation.design.mode.decorator.component.Shape;

/**
 * 具体装饰类
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setShapeRed();
    }

    private void setShapeRed() {
        System.out.println("Border Color: Red");
    }
}
