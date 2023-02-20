package com.innoventes.test.app.mapper;

import java.util.List;

import com.innoventes.test.app.dto.Employee_Dto;
import com.innoventes.test.app.entity.EmployeeEntity;

public interface Employee_mapper {
	Employee_Dto getEmployeedto(EmployeeEntity ementity);
	List<Employee_Dto> getEmployeedtoList(List<EmployeeEntity> ementitylist);
//  Employee_Dto getbyIDdto(EmployeeEntity ementity);

}
