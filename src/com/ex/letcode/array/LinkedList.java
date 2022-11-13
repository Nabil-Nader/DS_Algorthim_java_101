package com.ex.letcode.array;

public class LinkedList {
    public static void main(String[] args) {

        //Input: l1 = [2,4,3], l2 = [5,6,4]
        //Output: [7,0,8]
        //Explanation: 342 + 465 = 807.
        ListNode l1 = new ListNode(2,new ListNode());
         l1 = new ListNode(4,l1);
        ListNode l2 = new ListNode(7,new ListNode());
//        addTwoNumbers(l1,l2);
        //201
        int one = 1;
        int two = 0;
        int three=2;

        int r = one *10 ;
        r += two *10 ;
        r += three *10;
        System.out.println(r);


    }

    public static void addTwoNumbers(ListNode l1, ListNode l2) {

        int value = l1.val;
        ListNode next = l1.next;
        int value2 = next.val;
    }



}
