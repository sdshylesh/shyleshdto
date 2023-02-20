package com.innoventes.test.app.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.innoventes.test.app.dto.CompanyDTO;
import com.innoventes.test.app.dto.Employee_Dto;
import com.innoventes.test.app.entity.Company;
import com.innoventes.test.app.entity.EmployeeEntity;
@Component
public class Employee_mapperimpl implements Employee_mapper {

	@Override
	public Employee_Dto getEmployeedto(EmployeeEntity ementity) {
		Employee_Dto dto = new Employee_Dto(); 
		
		dto.setName(ementity.getName());
		dto.setSalary(ementity.getSalary());
		return dto;
		
	}

	@Override
	public List<Employee_Dto> getEmployeedtoList(List<EmployeeEntity> ementitylist) {
		List<Employee_Dto> dtolist=new ArrayList<Employee_Dto>();
		for (EmployeeEntity entity :ementitylist) {
			dtolist.add(getEmployeedto(entity));
		}

		return dtolist;
	}

//	@Override
//	public Employee_Dto getbyIDdto(EmployeeEntity ementity) {
//		Employee_Dto dto1 = new Employee_Dto(); 
//		dto1.setName(ementity.getName());
//		dto1.setSalary(ementity.getSalary());
//		return dto1;
//	}

}
