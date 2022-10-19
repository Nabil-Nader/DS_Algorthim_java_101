package com.ex.list.linkedlist;

import com.ex.list.array.Employee;

//other code in internet will be just a Node and has a type Generic
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next ;

    //constructor only takes employee because when we construct an instance,
    // we don't know yet what the next node will be
    //next by default will be null
    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString(){
        return employee.toString();
    }

}
