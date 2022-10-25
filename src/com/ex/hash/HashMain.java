package com.ex.hash;

import com.ex.Employee;

public class HashMain {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put(janeJones,"jones");
        ht.put(johnDoe,"doe");
        ht.put(marySmith,"smith");
        ht.put(mikeWilson,"wilson");
        ht.put(billEnd,"end");

//        ht.printHasTable();

        System.out.println("Retrieve an employee "+ht.get("doe"));

    }
}
