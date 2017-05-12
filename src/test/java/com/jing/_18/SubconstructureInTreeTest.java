package com.jing._18;

import org.junit.Assert;
import org.junit.Test;

public class SubconstructureInTreeTest {

    // 两棵树均为普通二叉树，且小树是大树的子结构
    @Test
    public void testIsSubconstructure_True() {
        Node<Integer> node1_7 = new Node<>(7, null, null);
        Node<Integer> node1_6 = new Node<>(7, null, null);
        Node<Integer> node1_5 = new Node<>(4, null, null);
        Node<Integer> node1_4 = new Node<>(2, node1_5, node1_6);
        Node<Integer> node1_3 = new Node<>(9, null, null);
        Node<Integer> node1_2 = new Node<>(8, node1_3, node1_4);
        Node<Integer> node1_1 = new Node<>(8, node1_2, node1_7);
        Node<Integer> node2_3 = new Node<>(2, null, null);
        Node<Integer> node2_2 = new Node<>(9, null, null);
        Node<Integer> node2_1 = new Node<>(8, node2_2, node2_3);
        Assert.assertTrue(SubconstructureInTree.isSubconstructure(node1_1, node2_1));
    }

    // 两棵树均为普通二叉树，且小树不是大树的子结构
    @Test
    public void testIsSubconstructure_False() {
        Node<Integer> node1_7 = new Node<>(7, null, null);
        Node<Integer> node1_6 = new Node<>(7, null, null);
        Node<Integer> node1_5 = new Node<>(4, null, null);
        Node<Integer> node1_4 = new Node<>(2, node1_5, node1_6);
        Node<Integer> node1_3 = new Node<>(9, null, null);
        Node<Integer> node1_2 = new Node<>(8, node1_3, node1_4);
        Node<Integer> node1_1 = new Node<>(8, node1_2, node1_7);
        Node<Integer> node2_3 = new Node<>(1, null, null);
        Node<Integer> node2_2 = new Node<>(9, null, null);
        Node<Integer> node2_1 = new Node<>(8, node2_2, node2_3);
        Assert.assertFalse(SubconstructureInTree.isSubconstructure(node1_1, node2_1));
    }

    // 大树为null
    @Test
    public void testIsSubconstructure_NullParent() {
        Node<Integer> node2_3 = new Node<>(2, null, null);
        Node<Integer> node2_2 = new Node<>(9, null, null);
        Node<Integer> node2_1 = new Node<>(8, node2_2, node2_3);
        Assert.assertFalse(SubconstructureInTree.isSubconstructure(null, node2_1));
    }

    // 小树为null
    @Test
    public void testIsSubconstructure_NullChild() {
        Node<Integer> node1_7 = new Node<>(7, null, null);
        Node<Integer> node1_6 = new Node<>(7, null, null);
        Node<Integer> node1_5 = new Node<>(4, null, null);
        Node<Integer> node1_4 = new Node<>(2, node1_5, node1_6);
        Node<Integer> node1_3 = new Node<>(9, null, null);
        Node<Integer> node1_2 = new Node<>(8, node1_3, node1_4);
        Node<Integer> node1_1 = new Node<>(8, node1_2, node1_7);
        Assert.assertFalse(SubconstructureInTree.isSubconstructure(node1_1, null));
    }

    // 两棵树均为null
    @Test
    public void testIsSubconstructure_Null() {
        Assert.assertFalse(SubconstructureInTree.isSubconstructure(null, null));
    }

    // 两棵树均没有左子树，且小树是大树的子结构
    @Test
    public void testIsSubconstructure_NoLeftTrue() {
        Node<Integer> node1_4 = new Node<>(4, null, null);
        Node<Integer> node1_3 = new Node<>(3, null, node1_4);
        Node<Integer> node1_2 = new Node<>(2, null, node1_3);
        Node<Integer> node1_1 = new Node<>(1, null, node1_2);
        Node<Integer> node2_2 = new Node<>(3, null, null);
        Node<Integer> node2_1 = new Node<>(2, null, node2_2);
        Assert.assertTrue(SubconstructureInTree.isSubconstructure(node1_1, node2_1));
    }

    // 两棵树均没有右子树，且小树是大树的子结构
    @Test
    public void testIsSubconstructure_NoRightTrue() {
        Node<Integer> node1_4 = new Node<>(4, null, null);
        Node<Integer> node1_3 = new Node<>(3, node1_4, null);
        Node<Integer> node1_2 = new Node<>(2, node1_3, null);
        Node<Integer> node1_1 = new Node<>(1, node1_2, null);
        Node<Integer> node2_2 = new Node<>(3, null, null);
        Node<Integer> node2_1 = new Node<>(2, node2_2, null);
        Assert.assertTrue(SubconstructureInTree.isSubconstructure(node1_1, node2_1));
    }

    // 两棵树均没有左子树，且小树不是大树的子结构
    @Test
    public void testIsSubconstructure_NoLeftFalse() {
        Node<Integer> node1_4 = new Node<>(4, null, null);
        Node<Integer> node1_3 = new Node<>(3, null, node1_4);
        Node<Integer> node1_2 = new Node<>(2, null, node1_3);
        Node<Integer> node1_1 = new Node<>(1, null, node1_2);
        Node<Integer> node2_2 = new Node<>(4, null, null);
        Node<Integer> node2_1 = new Node<>(2, null, node2_2);
        Assert.assertFalse(SubconstructureInTree.isSubconstructure(node1_1, node2_1));
    }

    // 两棵树均没有右子树，且小树不是大树的子结构
    @Test
    public void testIsSubconstructure_NoRightFalse() {
        Node<Integer> node1_4 = new Node<>(4, null, null);
        Node<Integer> node1_3 = new Node<>(3, node1_4, null);
        Node<Integer> node1_2 = new Node<>(2, node1_3, null);
        Node<Integer> node1_1 = new Node<>(1, node1_2, null);
        Node<Integer> node2_2 = new Node<>(4, null, null);
        Node<Integer> node2_1 = new Node<>(2, node2_2, null);
        Assert.assertFalse(SubconstructureInTree.isSubconstructure(node1_1, node2_1));
    }

}
