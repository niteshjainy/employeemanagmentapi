package com.employeemanagement.service;

import com.employeemanagement.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> empList = Arrays.asList(
            new Employee(1, "Nitesh Jain", "TCS"),
            new Employee(2, "Chetan Sul", "Accenture"),
            new Employee(3, "Vijay Yadav", "")
    );

    @Override
    public List<Employee> getAllEmployee() {
        return empList;
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
    }
}
