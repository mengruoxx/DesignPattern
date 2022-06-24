package designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 享元工厂，用来管理享元对象。包含一个对象池用于获取和创建享元对象。需要处理并发问题
 * @author mengruo
 * @date 2022/6/24 10:51
 */
public class TreeFactory {

    private static final List<TreeType> TREE_TYPE_POOL = new ArrayList<>();

    public static TreeType getTreeType(String texture, String color) {
        TreeType treeType = find(texture, color);
        // 可能会有并发问题，这里略去
        if (Objects.isNull(treeType)) {
            treeType = new TreeType(texture, color);
            TREE_TYPE_POOL.add(treeType);
        }
        return treeType;
    }

    private static TreeType find(String texture, String color) {
        for (TreeType treeType : TREE_TYPE_POOL) {
            if (treeType.getTexture().equals(texture) && treeType.getColor().equals(color)) {
                return treeType;
            }
        }
        return null;
    }

}
