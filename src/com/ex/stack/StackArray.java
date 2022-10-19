package com.ex.stack;

import java.util.EmptyStackException;

public class StackArray {
    private Employee[] stackEmployee;
    private int top;

    public StackArray(int capacity) {
        stackEmployee = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stackEmployee.length) {
            // need to resize the Array
            Employee[] newArray = new Employee[2 * stackEmployee.length];
            System.arraycopy(stackEmployee, 0, newArray, 0, stackEmployee.length);
        }
        stackEmployee[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = stackEmployee[--top];
        stackEmployee[top] = null;
        return employee;
    }

    public Employee peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackEmployee[top -1];
    }

    public int stackSize(){
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack(){
        for(int i = top -1 ; i >=0 ; i--){
            System.out.println(stackEmployee[i]);

        }
    }

}
