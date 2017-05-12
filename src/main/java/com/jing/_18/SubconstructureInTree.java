package com.jing._18;

/**
 * 判断一个二叉树是否是另一个二叉树的子结构
 * 
 * @version 1.0.0
 * @author  JingBo
 * @see     Node
 */

public class SubconstructureInTree {

    public static <T> boolean isSubconstructure(Node<T> parent, Node<T> child) {
        boolean result = false;
        if (parent == null || child == null) {
            return result;
        }
        if (parent.getValue().equals(child.getValue())) {
            result = contains(parent, child);
        }
        if (!result) {
            result = isSubconstructure(parent.getLeft(), child);
        }
        if (!result) {
            result = isSubconstructure(parent.getRight(), child);
        }
        return result;
    }

    private static <T> boolean contains(Node<T> parent, Node<T> child) {
        if (child == null) {
            return true;
        }
        if (parent == null) {
            return false;
        }
        if (!parent.getValue().equals(child.getValue())) {
            return false;
        }
        return (contains(parent.getLeft(), child.getLeft())
            && contains(parent.getRight(), child.getRight()));
    }

}
