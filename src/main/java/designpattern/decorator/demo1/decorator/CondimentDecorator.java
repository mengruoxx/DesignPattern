package designpattern.decorator.demo1.decorator;

import designpattern.decorator.demo1.component.Beverage;

/**
 * @author Mengruo
 * @date 2022/2/28 17:29
 * 调料装饰者抽象类，这个类继承抽象组件，并且有一个用于加强被装饰类的抽象方法
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

}
