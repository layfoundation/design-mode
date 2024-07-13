package com.layfoundation.design.mode.factory.abstractF;

import com.layfoundation.design.mode.factory.product.cheese.Cheese;
import com.layfoundation.design.mode.factory.product.cheese.NorthACheese;
import com.layfoundation.design.mode.factory.product.cheese.NorthBCheese;
import com.layfoundation.design.mode.factory.product.dough.Dough;
import com.layfoundation.design.mode.factory.product.dough.NorthADough;
import com.layfoundation.design.mode.factory.product.dough.NorthBDough;

/**
 * 北方披萨原料工厂
 */
public class NorthPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough(String type) {
        if (type.equals("A")) {
            return new NorthADough();
        } else if (type.equals("B")) {
            return new NorthBDough();
        }
        return null;
    }

    @Override
    public Cheese createCheese(String type) {
        if (type.equals("A")) {
            return new NorthACheese();
        } else if (type.equals("B")) {
            return new NorthBCheese();
        }
        return null;
    }
}
