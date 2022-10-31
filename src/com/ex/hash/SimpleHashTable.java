package com.ex.hash;

import com.ex.Employee;

public class SimpleHashTable {

    private StoreEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoreEmployee[10];
    }

    //hashing function , we are going to use employee last name as key
    private int hashKey(String key) {
        // joanse => 5 % 10 => 5
//        System.out.println("Hash Key vlaue for :"+key +" is :" +key.length() % hashTable.length);
        return key.length() % hashTable.length;
    }

    // add function

    public void put(Employee employee, String key) {

        // this will give us the index so we can put it in the array
        int hashKey = hashKey(key);

        // we check to see if we already put employee in this position
        // we did not handel collation

        // if it is occupied we need to do liner probing
        if (occupied(hashKey)) {

            int stopIndex = hashKey;
            if (hashKey == hashTable.length - 1) {
                hashKey = 0;
            } else {
                hashKey++;
            }
            while (occupied(hashKey) && hashKey != stopIndex) {
                // so we will not get index out of bound
                hashKey = (hashKey + 1) % hashTable.length;
            }

        }
        // here we checked the entire array and it is full
        if (occupied(hashKey)) {
            System.out.println("Sorry there are already an employee in this postion " + hashKey);
        } else {
            hashTable[hashKey] = new StoreEmployee(key, employee);
        }


    }

    public Employee get(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        } else {
            return hashTable[hashKey].getEmployee();
        }
    }

    public Employee remove(String key) {
        int hashKey = findKey(key);
        if (hashKey == -1) {
            return null;
        }

        Employee employee = hashTable[hashKey].getEmployee();
        hashTable[hashKey] = null;

        StoreEmployee []oldHashTable = hashTable;
        hashTable = new StoreEmployee[oldHashTable.length];
        for (StoreEmployee storeEmployee : oldHashTable) {
            if (storeEmployee != null) {
                put(storeEmployee.getEmployee(), storeEmployee.getKey());
            }
        }


        return employee;
    }

    public void printHasTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] == null) {
                System.out.println("Empty!");
            } else {
                System.out.println("Position :" + i + " e :" + hashTable[i].getEmployee());
            }
        }
    }

    private boolean occupied(int index) {
        return hashTable[index] != null;
    }

    private int findKey(String key) {
        int hashKey = hashKey(key);
        if (hashTable[hashKey] != null && hashTable[hashKey].getKey().equals(key)) {
            return hashKey;
        }

        int stopIndex = hashKey;
        if (hashKey == hashTable.length - 1) {
            hashKey = 0;
        } else {
            hashKey++;
        }
        while ((hashTable[hashKey] != null)
                && !(hashTable[hashKey].getKey().equals(key))
                && (hashKey != stopIndex)) {
            // so we will not get index out of bound
            hashKey = (hashKey + 1) % hashTable.length;
        }

        if(hashTable[hashKey] !=null && hashTable[hashKey].getKey().equals(key)){
            return  hashKey;
        }else {
            return -1;
        }
    }
}
