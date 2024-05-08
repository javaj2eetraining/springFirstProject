package com.example.springFirstProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springFirstProject.repository.DepartmentRepository;
import com.example.springFirstProject.entity.Department;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {


		return departmentRepository.save(department);

		
		
	}


	public List<Department> getDepartments() {
		return departmentRepository.findAll();


	}

	public Department getDepartment(Long departmentID) {


		Optional<Department> department = departmentRepository.findById(departmentID);

		if (!department.isPresent()) {
			throw new RuntimeException("Department not found");
		}
		return department.get();

	}

	public Department getDepartmentByName(String deptName) {
		return  departmentRepository.findByDepartmentName(deptName);
	}

	public Department updateDepartment(Department dept, Long id) {

		Optional<Department> department =  departmentRepository.findById(id);

		if(!department.isPresent())
		{
			throw new RuntimeException("Department not found");
		}
		Department existingDBdepartment = department.get();

		if(!existingDBdepartment.getDepartmentName().equals(dept.getDepartmentName()))
		{
			existingDBdepartment.setDepartmentName(dept.getDepartmentName());
		}
		if(!existingDBdepartment.getDepartmentAddress().equals(dept.getDepartmentAddress()))
		{
			existingDBdepartment.setDepartmentAddress(dept.getDepartmentAddress());
		}
		return departmentRepository.save(existingDBdepartment);

	}

	public void deleteDepartment(Long id) {
		 departmentRepository.deleteById(id);
	}
}
