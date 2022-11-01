package com.ex.bst.insertion;

public class SimpleBST {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15); // this will have once child , so we will move 17 to be in a left side
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);
        tree.insert(17);// we will delete this [delete as a leaf]

//        [15,20,22,25,26,27,29,30,32]

        tree.travelsInOrder();
        System.out.println();

        tree.delete(15);
        tree.travelsInOrder();
        System.out.println();

        tree.delete(27);
        tree.travelsInOrder();
        System.out.println();

        tree.delete(25);
        tree.travelsInOrder();
        System.out.println();


//        System.out.println(tree.get(25));
//        System.out.println(tree.get(32));
//        System.out.println(tree.get(888));
//        System.out.println(tree.get(27));
//        System.out.println(tree.min());
//        System.out.println(tree.max());
    }
}
