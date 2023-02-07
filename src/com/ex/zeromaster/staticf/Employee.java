package com.ex.zeromaster.staticf;

public class Employee extends User {


    public static void doAnyStaticAction() {
        System.out.println("Static method in Employee class is called.");
    }

    public void doAnyStaticActionNotStatic() {
        System.out.println("not Static  method in Employee class is called.");
    }

}