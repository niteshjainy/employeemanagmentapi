package com.employeemanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @RequestMapping("welcome")
    public String insert()
    {
        return "Hello Sir";
    }
}