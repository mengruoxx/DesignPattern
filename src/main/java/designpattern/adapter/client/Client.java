package designpattern.adapter.client;

import designpattern.adapter.adapter.DuckAdapter;
import designpattern.adapter.componet.Duck;
import designpattern.adapter.componet.Turkey;
import designpattern.adapter.componet.impl.OneTurkey;

import java.util.Map;

/**
 * @author Mengruo
 * @date 2022/3/8 17:25
 */
public class Client {
    public static void main(String[] args) {
        // 一个duck类的适配器，接收一个火鸡类的对象
        Turkey oneTurkey = new OneTurkey();
        Duck turkeyDuck = new DuckAdapter(oneTurkey);
        // 就可以像调用duck类的方法一样调用
        turkeyDuck.fly();
    }
}
