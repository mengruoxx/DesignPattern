package designpattern.decorator.demo1.decorator.impl;

import designpattern.decorator.demo1.component.Beverage;
import designpattern.decorator.demo1.decorator.CondimentDecorator;

/**
 * @author Mengruo
 * @date 2022/2/28 18:15
 */
public class Bean extends CondimentDecorator {

    Beverage beverage;

    @Override
    public double cost() {
        int size = beverage.getSize();
        if (size == 0) {
            return beverage.cost() + 1;
        } else {
            return beverage.cost() + 2;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "bean";
    }
}
