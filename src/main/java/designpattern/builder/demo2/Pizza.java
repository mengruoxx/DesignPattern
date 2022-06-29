package designpattern.builder.demo2;

import java.util.EnumSet;
import java.util.Set;

/**
 * Pizza抽象类
 * 这个demo是展示Builder在抽象
 * @author mengruo
 * @date 2022/6/28 19:24
 */
public abstract class Pizza {

    public enum Topping {
        /**
         * 调料
         */
        HAM, MUSHROOM, ONION
    }

    private final Set<Topping> toppings;

    public Pizza(Builder builder) {
        this.toppings = builder.toppings;
    }

    abstract static class Builder<T extends Builder<T>> {

        /**
         * 初始化为一个空的EnumSet
         */
        private final EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            // 直接返回this，调用时返回的就是父类PizzaBuilder，所以把这个返回值用方法让子类实现返回，这个时候需要类上的泛型，需要子类将具体的builder类传进来
//            return this;
            return self();
        }

        /**
         * 子类实现返回自己的子类builder
         * @return
         */
        protected abstract T self();

        /**
         * build方法是抽象的，子类的build需要实现，返回具体的子类对象。子类的方法返回值直接写子类具体类型就可以
         * @return
         */
        protected abstract Pizza build();
    }

}
