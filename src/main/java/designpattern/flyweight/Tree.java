package designpattern.flyweight;

import lombok.Data;

/**
 * 树，情景类，包含享元对象的引用，和一些可变状态
 * 和原始对象的区别就是将重复状态提取为享元对象
 * @author mengruo
 * @date 2022/6/24 15:09
 */
@Data
public class Tree {
    private TreeType treeType;
    private int x;
    private int y;

    public Tree(TreeType treeType, int x, int y) {
        this.treeType = treeType;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("draw treeType" + treeType + x + y);
    }
}
