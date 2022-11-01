package com.ex.bst.insertion;

public class SimpleBST {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

//        [15,20,22,25,26,27,29,30,32]

//        tree.travelsInOrder();
        System.out.println(tree.get(25));
        System.out.println(tree.get(32));
        System.out.println(tree.get(888));
        System.out.println(tree.get(27));
    }
}
