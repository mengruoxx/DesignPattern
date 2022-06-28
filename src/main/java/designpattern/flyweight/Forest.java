package designpattern.flyweight;

/**
 * 客户端，调用方
 * @author mengruo
 * @date 2022/6/24 15:30
 */
public class Forest {

    public void paintTree(String texture, String color, int x, int y) {
        // 得到享元对象
        TreeType treeType = TreeFactory.getTreeType(texture, color);
        // 利用享元对象和独有属性构造对象
        Tree tree = new Tree(treeType, x, y);
        tree.draw();
    }
}
