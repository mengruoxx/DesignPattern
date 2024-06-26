package designpattern.builder.demo2;


/**
 * @author mengruo
 * @date 2022/6/29 11:47
 */
public class Main {
    public static void main(String[] args) {
        NyPizza.Builder builder = new NyPizza.Builder().size(NyPizza.Size.LARGE).addTopping(Pizza.Topping.ONION);
        NyPizza build = builder.build();
    }
}
