package com.ex.list.linkedlist;

import com.ex.list.array.Employee;

public class SingleMain {
    public static void main(String[] args) {
        // by using list, if I decide later to change and use a different type of list
        Employee jane = new Employee("Jane", "Doa", 123);
        Employee john = new Employee("John", "Doa", 456);
        Employee billy = new Employee("Billy", "Doa", 789);
        Employee nader = new Employee("Nader", "Doa", 1011);


        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(jane);
        employeeLinkedList.addToFront(john);
        employeeLinkedList.addToFront(billy);
        employeeLinkedList.addToFront(nader);

        employeeLinkedList.printNode();
        System.out.println(employeeLinkedList.getSize());

        employeeLinkedList.removeFromFirnt();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printNode();
    }
}
