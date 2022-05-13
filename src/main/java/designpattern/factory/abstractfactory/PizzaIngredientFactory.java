package designpattern.factory.abstractfactory;

import designpattern.factory.entity.Cheese;

/**
 * @author Mengruo
 * @date 2022/3/7 20:40
 */
public interface PizzaIngredientFactory {

    Cheese createCheese();
}
