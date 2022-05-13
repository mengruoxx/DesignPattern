package designpattern.factory.abstractfactory.impl;

import designpattern.factory.abstractfactory.PizzaIngredientFactory;
import designpattern.factory.entity.Cheese;

/**
 * @author Mengruo
 * @date 2022/3/7 20:42
 */
public class ItalyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Cheese createCheese() {
        return null;
    }
}
