package com.ex.list.linkedlist.doubly;

import com.ex.list.array.Employee;

//other code in internet will be just a Node and has a type Generic
public class EmployeeDoublyNode {

    private Employee employee;
    private EmployeeDoublyNode next ;
    private EmployeeDoublyNode previous ;

    //constructor only takes employee because when we construct an instance,
    // we don't know yet what the next node will be
    //next by default will be null
    public EmployeeDoublyNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDoublyNode getNext() {
        return next;
    }

    public void setNext(EmployeeDoublyNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }

    public EmployeeDoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDoublyNode previous) {
        this.previous = previous;
    }

}
