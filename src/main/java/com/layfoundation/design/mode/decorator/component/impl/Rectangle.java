package com.layfoundation.design.mode.decorator.component.impl;

import com.layfoundation.design.mode.decorator.component.Shape;

/**
 * 具体构件
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
