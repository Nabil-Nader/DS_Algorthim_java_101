package com.ex.stack;

public class StackMain {
    public static void main(String[] args) {

        StackArray stackArray = new StackArray(10);
        stackArray.push(new Employee("Jane","Dao",123));
        stackArray.push(new Employee("Billy","Dao",123));
        stackArray.push(new Employee("Mick","Dao",123));
        stackArray.push(new Employee("Mary","Dao",123));
        stackArray.push(new Employee("Bill","Dao",123));


//        stackArray.printStack();

        System.out.println(stackArray.peek());
        System.out.println("popped :"+ stackArray.pop());
        System.out.println(stackArray.peek());



    }

}
