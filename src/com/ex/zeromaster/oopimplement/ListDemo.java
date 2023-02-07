package com.ex.zeromaster.oopimplement;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    /*
        let's see how linkedList works and why it is called so,
        each Node has 3 value [next - data - previous ]
        linkedList  implements List<E>, Deque<E>.

     */

    /*
        which implementation of list to use and linkedList or ArrayList ?
        we need to know which environment we are planning  to use and regarding amount of data
        let's preview performance of each list implementation

        let's compare
                ArrayList   LinkedList
        get     O(1)        O(n)
        add     O(1)        O(1)
        remove  O(n)        o(1)

     */

    public static void main(String[] args) {
        List list1 = new ArrayList();
        List<String> list2 = new ArrayList<>();

        // === non-generic list demo
        list1.add("some string");
        list1.add(1);
        Object object = list1.get(1);
        System.out.println(object);

        // === generic list demo
        list2.add("some string");
//		list2.add(1); // COMPILATION ERROR! Can't add integer
        String string = list2.get(0);
        System.out.println(string);



    }


}
