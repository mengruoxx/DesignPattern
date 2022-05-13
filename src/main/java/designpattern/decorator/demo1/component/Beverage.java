package designpattern.decorator.demo1.component;

import lombok.Data;

/**
 * @author Mengruo
 * @date 2022/2/28 17:17
 */
@Data
public abstract class Beverage {

    protected String description;

    protected int size;

    public abstract double cost();
}
