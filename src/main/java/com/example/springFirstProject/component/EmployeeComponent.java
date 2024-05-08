package com.example.springFirstProject.component;

import com.example.springFirstProject.controller.DepartmentController;
import com.example.springFirstProject.controller.EmployeeController;
import com.example.springFirstProject.controller.OwnerController;
import com.example.springFirstProject.service.DepartmentService;
import com.example.springFirstProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.example.pack1.Student;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


@Component // @Controller , @RestController  @Repository @Service   @Configuration   @Bean  -- mehtod level
public class EmployeeComponent {
//
//    @Autowired
//    Student student;

    @Autowired
    DepartmentService departmentService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentController departmentController;

    @Autowired
    EmployeeController employeeController;

    @Autowired
    OwnerController ownerController;






}
