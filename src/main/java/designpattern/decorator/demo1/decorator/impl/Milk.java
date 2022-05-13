package designpattern.decorator.demo1.decorator.impl;

import designpattern.decorator.demo1.component.Beverage;
import designpattern.decorator.demo1.decorator.CondimentDecorator;

/**
 * @author Mengruo
 * @date 2022/2/28 18:00
 * 具体的装饰者，需要在构造方法中将被装饰者传进来
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double originalCost = beverage.cost();
        return originalCost + 3.0;
    }

    @Override
    public String getDescription() {
        String originalDesc = beverage.getDescription();
        return originalDesc + " milk";
    }
}
