package com.employeemanagement.service;

import com.employeemanagement.dto.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int empId);
}
