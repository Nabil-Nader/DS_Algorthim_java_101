package com.ex.bst.insertion;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;


    public void insertTreeNode(int value) {
        // our tree does not support any duplicate
        if (value == data) {
            return;
        }
        if (value < data) {
            // if left is null we found our insertion node
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                // if node has a left child we are gonna insert into different branch
                leftChild.insertTreeNode(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insertTreeNode(value);
            }
        }
    }

    // we visit the left child,and we visit the root then we visit the right child
    public void traversalInOrder() {
        if (leftChild != null) {
            leftChild.traversalInOrder();
        }
        System.out.print(data + " ,");
        if (rightChild != null) {
            rightChild.traversalInOrder();
        }

    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
            // left side
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }
}
