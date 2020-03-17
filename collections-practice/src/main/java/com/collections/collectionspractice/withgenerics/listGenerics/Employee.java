package com.collections.collectionspractice.withgenerics.listGenerics;

public class Employee {

    private int empId;
    private String empName;
    private long age;

    public int getEmpId() {
        return empId;
    }

    public Employee setEmpId(int empId) {
        this.empId = empId;
        return this;
    }

    public String getEmpName() {
        return empName;
    }

    public Employee setEmpName(String empName) {
        this.empName = empName;
        return this;
    }

    public long getAge() {
        return age;
    }

    public Employee setAge(long age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                '}';
    }
}
