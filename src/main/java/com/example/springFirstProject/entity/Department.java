package com.example.springFirstProject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "dept")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deparmentId;
	public Long getDeparmentId() {
		return deparmentId;
	}
	public void setDeparmentId(Long deparmentId) {
		this.deparmentId = deparmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	@Column(name = "deptName")
	private String departmentName;
	@Column(name = "deptAddress")
	private String departmentAddress;


	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
	

}
