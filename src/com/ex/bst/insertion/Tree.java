package com.ex.bst.insertion;

public class Tree {
    // we only root, so we can get to everything by traverse

    // if the tree is empty then the node become the root,
    // if the tree isn't empty we're going to compare the value we're inserting against the root node.
    private TreeNode root;


    public void  insert(int value){
        if(root== null){
            root = new TreeNode(value);
        }else {
            root.insertTreeNode(value);
        }
    }
    public void travelsInOrder(){
        if(root !=null) {
            root.traversalInOrder();
        }
    }

    public TreeNode get(int value){
        if(root !=null){
            return root.get(value);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
