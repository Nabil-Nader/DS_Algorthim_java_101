package com.ex.list.array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // by using list, if I decide later to change and use a different type of list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane","Doa",123));
        employeeList.add(new Employee("John","Doa",456));
        employeeList.add(new Employee("Billy","Doa",789));
        employeeList.add(new Employee("Nader","Doa",1011));

        employeeList.forEach(emp -> System.out.println(emp));

    }
}
