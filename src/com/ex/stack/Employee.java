package com.ex.stack;

import java.util.Objects;

public class Employee {
    private String fName;
    private String lnName;
    private int id;

    public Employee(String fName, String lnName, int id) {
        this.fName = fName;
        this.lnName = lnName;
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getLnName() {
        return lnName;
    }

    public void setLnName(String lnName) {
        this.lnName = lnName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && fName.equals(employee.fName) && lnName.equals(employee.lnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lnName, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fName='" + fName + '\'' +
                ", lnName='" + lnName + '\'' +
                ", id=" + id +
                '}';
    }
}
