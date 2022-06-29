package designpattern.builder.demo1;

/**
 * @author mengruo
 * @date 2022/6/28 11:47
 */
public class Car {

    /**
     * 一个不可变的类
     */
    private final String name;
    private final String color;
    private final int speed;

    public static class Builder {
        // 必选参数用final修饰，并作为Builder构造方法的参数
        private final String name;
        // 可选参数，初始化为默认值
        private int speed = 0;
        private String color = "black";

        public Builder(String name) {
            this.name = name;
        }

        /**
         * Builder的set方法，返回builder
         * @param speed
         * @return
         */
        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        /**
         * 返回构建好的对象
         * @return
         */
        public Car build() {
            return new Car(this);
        }
    }

    /**
     * 有一个builder为参数的构造函数，并且是private的
     * @param builder
     */
    private Car(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.color = builder.color;
    }

    public static void main(String[] args) {
        Car car = new Builder("car1").color("red").speed(1).build();
    }

}
