package com.layfoundation.design.mode.factory.abstractF;

import com.layfoundation.design.mode.factory.product.cheese.Cheese;
import com.layfoundation.design.mode.factory.product.dough.Dough;

/**
 * 抽象工厂
 * 披萨原料工厂
 */
public interface PizzaIngredientFactory {
    Dough createDough(String type);

    Cheese createCheese(String type);
}
