package com.employeemanagement.dto;

public class Employee {

private int empId;
private String empName;
private String deptName;

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
