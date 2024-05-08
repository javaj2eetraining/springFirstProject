package com.example.springFirstProject.controller;

import com.example.springFirstProject.component.EmployeeComponent;
import com.example.springFirstProject.entity.Employee;
import com.example.springFirstProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

//    @Autowired
//    private EmployeeComponent employeeComponent;
    @Autowired
    DataSource dataSource;
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        System.out.println(" In employee Controller");


        return employeeService.saveEmployee(employee);


    }

    @GetMapping("/getEmployess")
    public List<Employee> getAllEmployees() {
        return employeeService.getEmployees();
    }
}
