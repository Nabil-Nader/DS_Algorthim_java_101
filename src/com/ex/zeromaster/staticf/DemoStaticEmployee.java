package com.ex.zeromaster.staticf;

public class DemoStaticEmployee {
    public static void main(String[] args) {

        User user3 = new Employee();
        user3.doAnyStaticAction(); //Static method in User class is called.

        user3.doAnyStaticActionNotStatic(); //not Static  method in Employee class is called.


//        User.doAnyStaticAction(); //Static method in User class is called.

//        Employee.doAnyStaticAction();//Static method in Employee class is called.

    }
}
