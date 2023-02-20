package com.innoventes.test.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	private Integer employeeid;
	private String name;
	private String companyid;
	private long salary;
	
	public EmployeeEntity(Integer employeeid, String name, String companyid, long salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.companyid = companyid;
		this.salary = salary;
	
	}
	public EmployeeEntity() {
	System.out.println(" i am entity constructor");
	}
	public Integer getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	
}
