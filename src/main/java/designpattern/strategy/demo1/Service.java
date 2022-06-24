package designpattern.strategy.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mengruo
 * @date 2022/1/2 12:25
 * 商场收银软件，输入商品的价格和数量，计算总价。可能会有不同的促销活动，比如打折，满减
 * 增加一个促销策略的参数，促销策略是一个抽象类，有抽象方法计算打折后的价格, 然后也需要一个工厂类去创建具体的策略
 * 每次增加收费策略，需要去改动这个简单工厂。
 */
public class Service {
    public double calTotalPrice(List<GoodItem> goodItemList, Integer index) throws Exception {
        SaleContext saleContext = new SaleContext();
        return saleContext.calSalePrice(goodItemList, index);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list.add(list1);
        list.add(list2);
        ArrayList<List<Integer>> newList = new ArrayList<>(list);
        list.remove(1);
        list1.set(0, 9);

        System.out.println(list);
        System.out.println(newList);
    }

}
