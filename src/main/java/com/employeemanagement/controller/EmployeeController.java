package com.employeemanagement.controller;

import com.employeemanagement.dto.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {
    @RequestMapping("welcome")
    public String insert()
    {
        return "Hello Sir";
    }
    @RequestMapping("employees")
    public List<Employee> getAllEmployee(){
        return (Arrays.asList(
                new Employee(1, "Nitesh Jain", "TCS"),
                new Employee(2, "Chetan Sul", "Accenture"),
                new Employee(3, "Vijay Yadav", "")
        ));
    }
}
