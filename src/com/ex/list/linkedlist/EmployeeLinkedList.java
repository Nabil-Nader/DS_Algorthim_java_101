package com.ex.list.linkedlist;

import com.ex.list.array.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        // for first Node [ head is null, so Next will be null], but when we assign head = node now head has data
        // for the second node we create an Employee but it's done have a next , so when we set next we set it to the preivous node
        //in short we add node in reverse order [print will print last Employee that added
        node.setNext(head);
        head = node;
        size ++;

    }

    public boolean isEmpty(){
        return head==null;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printNode(){
        EmployeeNode current = head;
        System.out.print("This is the Head ->");
        while (current !=null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public EmployeeNode removeFromFirnt(){
        if(isEmpty()){
            return null;
        }else{
            EmployeeNode removeNode = head;
            head = head.getNext();
            removeNode.setNext(null);
            size --;
            return removeNode;
        }
    }

}
