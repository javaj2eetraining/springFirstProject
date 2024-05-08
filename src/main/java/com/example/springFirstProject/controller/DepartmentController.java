package com.example.springFirstProject.controller;

import com.example.pack1.Address;
import com.example.springFirstProject.component.EmployeeComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springFirstProject.entity.Department;
import com.example.springFirstProject.service.DepartmentService;
import java.util.List;
import com.example.pack1.Student;

import javax.sql.DataSource;

@RestController
public class DepartmentController {
	
	    @Autowired
	    DepartmentService departmentService;


		@Autowired
		Address address;

		@Autowired
	    DataSource dataSource;
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {


		System.out.println("Student object");

		return departmentService.saveDepartment(department);
			
			
		}
		@GetMapping("/getDepartments")
	    public List<Department> getAllDepartments() {

			return departmentService.getDepartments();
		}

		@GetMapping("/getDepartments/{id}")
	    public Department getDepartment(@PathVariable("id")  Long id  )
		{

			return departmentService.getDepartment(id);
		}

	@GetMapping("/getDepartmentsName/{name}")
	public Department getDepartmentByName(@PathVariable("name")  String deptName  )
	{

         return  departmentService.getDepartmentByName(deptName)  ;
	}

	@PutMapping("/update/{id}")
	public Department updateDepartment(@RequestBody Department department , @PathVariable("id") Long id) {
		return departmentService.updateDepartment(department,id);

	}

	@DeleteMapping("/deleteDepartment/{id}")
	public String updateDepartment( @PathVariable("id") Long id) {
		 departmentService.deleteDepartment(id);
		 return "Deleted succefully";

	}
}
