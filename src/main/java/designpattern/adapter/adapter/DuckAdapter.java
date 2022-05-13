package designpattern.adapter.adapter;

import designpattern.adapter.componet.Duck;
import designpattern.adapter.componet.Turkey;

/**
 * @author Mengruo
 * @date 2022/3/8 17:21
 * 鸭子类的适配器，实现鸭子类接口，包含一个火鸡类的实例变量，在鸭子类的方法里将火鸡类的方法进行某些转换
 */
public class DuckAdapter implements Duck {

    private Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.guack();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
