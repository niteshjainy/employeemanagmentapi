package com.employeemanagement.controller;

import com.employeemanagement.dto.Employee;
import com.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService empServiceRef;

    @RequestMapping("welcome")
    public String insert()
    {
        return "Hello Sir";
    }

    @RequestMapping("employees")
    public List<Employee> getAllEmployee(){
        return empServiceRef.getAllEmployee();
    }

    @RequestMapping("/employee/{empId}")
    public Employee getEmployeeById(@PathVariable int empId) {
        return empServiceRef.getEmployeeById(empId);
    }
}
