package com.example.springFirstProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springFirstProject.entity.Department;
import com.example.springFirstProject.service.DepartmentService;
import java.util.List;

@RestController
public class DepartmentController {
	
	    @Autowired
	    DepartmentService departmentService;

	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("Hiiiiiiiiiiii");

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

	@DeleteMapping("/delete/{id}")
	public String updateDepartment( @PathVariable("id") Long id) {
		 departmentService.deleteDepartment(id);
		 return "Deleted succefully";

	}
}
