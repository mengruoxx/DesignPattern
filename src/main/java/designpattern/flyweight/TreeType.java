package designpattern.flyweight;

import lombok.Data;

/**
 * 树的种类。享元对象，包含重复不可变状态，通常包含的数据比较大，可以重复利用以节约内存
 * 这些对象的属性可以被重复利用，可以做成对象池
 * @author mengruo
 * @date 2022/6/23 20:00
 */
@Data
public class TreeType {

    private final String texture;
    private final String color;

    public TreeType(String texture, String color) {
        this.texture = texture;
        this.color = color;
    }
}
