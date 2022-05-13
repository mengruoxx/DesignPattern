package designpattern.decorator.demo1.client;

import designpattern.decorator.demo1.component.Beverage;
import designpattern.decorator.demo1.component.impl.CoffeeOne;
import designpattern.decorator.demo1.decorator.impl.Milk;
import designpattern.decorator.demo1.decorator.impl.Mocha;

/**
 * @author Mengruo
 * @date 2022/2/28 17:46
 */
public class Client {

    public static void main(String[] args) {
        Beverage coffeeOne = new CoffeeOne();
        // 用Milk装饰类装饰coffeeOne
        coffeeOne = new Milk(coffeeOne);
        coffeeOne = new Mocha(coffeeOne);
        System.out.println("description = " + coffeeOne.getDescription() + " cost: " + coffeeOne.cost());
    }
}
