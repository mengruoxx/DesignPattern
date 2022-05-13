package designpattern.decorator.demo1.component.impl;

import designpattern.decorator.demo1.component.Beverage;
import lombok.Data;

/**
 * @author Mengruo
 * @date 2022/2/28 17:18
 */
@Data
public class CoffeeTwo extends Beverage {

    public CoffeeTwo() {
        description = "CoffeeTwo";
    }

    @Override
    public double cost() {
        return 8.0;
    }
}
