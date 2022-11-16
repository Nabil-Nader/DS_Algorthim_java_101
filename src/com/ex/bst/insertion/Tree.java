package com.ex.bst.insertion;

public class Tree {
    // we only root, so we can get to everything by traverse

    // if the tree is empty then the node become the root,
    // if the tree isn't empty we're going to compare the value we're inserting against the root node.
    private TreeNode root; // head


    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insertTreeNode(value);
        }
    }

    public void travelsInOrder() {
        if (root != null) {
            root.traversalInOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.max();
        }
    }

    public void delete(int value) {
        // call a recursive method
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return subTreeRoot;
        }
        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));

        } else {
            // this is a leaf : case 0 , 1 node to delete has 0 or 1 children
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            // case 3: Node to delete has 2 children
            // at this level this subtree is the node we want to delete
            subTreeRoot.setData(subTreeRoot.getRightChild().min());
            //replace subtree with the smallest value in the right and ddelete it
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));


        }




        return subTreeRoot;
    }

    @Override
    public String toString() {
        return "Tree{" + "root=" + root + '}';
    }
}
