package com.layfoundation.design.mode.factory.abstractF;

import com.layfoundation.design.mode.factory.product.cheese.Cheese;
import com.layfoundation.design.mode.factory.product.cheese.SouthACheese;
import com.layfoundation.design.mode.factory.product.cheese.SouthBCheese;
import com.layfoundation.design.mode.factory.product.dough.Dough;
import com.layfoundation.design.mode.factory.product.dough.SouthADough;
import com.layfoundation.design.mode.factory.product.dough.SouthBDough;

/**
 * 南方披萨原料工厂
 */
public class SouthPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough(String type) {
        if (type.equals("A")) {
            return new SouthADough();
        } else if (type.equals("B")) {
            return new SouthBDough();
        }
        return null;
    }

    @Override
    public Cheese createCheese(String type) {
        if (type.equals("A")) {
            return new SouthACheese();
        } else if (type.equals("B")) {
            return new SouthBCheese();
        }
        return null;
    }
}
