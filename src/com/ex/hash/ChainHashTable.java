package com.ex.hash;

import com.ex.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainHashTable {

    private LinkedList<StoreEmployee>[] hashTable;

    public ChainHashTable() {
        hashTable = new LinkedList[10];
        // remove this later to see what is happening
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(Employee employee,String key) {
        int hashKEy = hashKey(key);
        //this will require more memory
        hashTable[hashKEy].add(new StoreEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashKey = hashKey(key);

        ListIterator<StoreEmployee> iterator = hashTable[hashKey].listIterator();

        StoreEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.getKey().equals(key)) {
                return employee.getEmployee();
            }
        }
        return null;

    }

    public  Employee remove(String key){
        int hashKey = hashKey(key);

        ListIterator<StoreEmployee> iterator = hashTable[hashKey].listIterator();

        StoreEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.getKey().equals(key)) {
               break;
            }
            }
        if(employee == null || !employee.getKey().equals(key)){
            return null;
        }else {
            // we did find it and we want to remove it
            hashTable[hashKey].remove(index);
            return employee.getEmployee();
        }

    }

    public void printHasTable(){
        for(int i = 0 ; i < hashTable.length;i++){
            if(hashTable[i].isEmpty()){
                System.out.println("Empty at position "+i);
            }else{
                ListIterator<StoreEmployee> iterator = hashTable[i].listIterator();
               while (iterator.hasNext()) {
                   System.out.print(iterator.next().getEmployee());
                   System.out.print("=>");
               }
                System.out.println("null");


            }
        }

    }

    private int hashKey(String key) {
        return key.length() % hashTable.length;
    }
}
