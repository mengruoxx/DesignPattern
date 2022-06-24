package designpattern.flyweight;

/**
 * 客户端，调用方
 * @author mengruo
 * @date 2022/6/24 15:30
 */
public class Forest {

    public void paintTree(String texture, String color, int x, int y) {
        TreeType treeType = TreeFactory.getTreeType(texture, color);
        Tree tree = new Tree(treeType, x, y);
        tree.draw();
    }
}
