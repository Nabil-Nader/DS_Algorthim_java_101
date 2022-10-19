package com.ex.list.linkedlist;

import com.ex.list.array.Employee;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

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
