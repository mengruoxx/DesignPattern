package designpattern.decorator.demo1.decorator.impl;

import designpattern.decorator.demo1.component.Beverage;
import designpattern.decorator.demo1.decorator.CondimentDecorator;

/**
 * @author Mengruo
 * @date 2022/2/28 17:43
 * 具体的装饰者类，其中有一个被装饰者抽象类实例变量，需要实现 抽象装饰者 以及 被装饰者抽象类 的抽象方法
 */
public class Mocha extends CondimentDecorator {

    protected Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double originalCost = beverage.cost();
        return originalCost + 2.0;
    }

    @Override
    public String getDescription() {
        String originalDesc = beverage.getDescription();
        return originalDesc + " Mocha";
    }
}
