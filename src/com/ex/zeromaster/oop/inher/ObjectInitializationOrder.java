package com.ex.zeromaster.oop.inher;

public class ObjectInitializationOrder {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println("=====================");
        Parent p2 = new Parent();
    }
    // statics blocks are executed when classes are uploaded into JVM,
    /*
        why did the static object did not executed twice, when classes are uploaded into JVM,
        it is not associated with the object of this class but with the class itself →
        so when classes are uploaded into JVM.
        these blocks are executed, they won’t be executed two times in a row home
     */

}


class Parent {
    static {
        System.out.println("Static init block parent");//1
    }

    {
        System.out.println("Init block parent");//3
    }

    public Parent() {
        System.out.println("Parent constructor");//4
    }

}

class Child extends Parent {
    static {
        System.out.println("Static init block child");//2
    }

    {
        System.out.println("Init block child");//5
    }

    public Child() {
        System.out.println("child constructor");//6
    }
}