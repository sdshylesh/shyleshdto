package com.innoventes.test.app.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.test.app.dto.Employee_Dto;
import com.innoventes.test.app.entity.EmployeeEntity;
import com.innoventes.test.app.entity.Login;
import com.innoventes.test.app.mapper.Employee_mapper;
import com.innoventes.test.app.repository.Employeerepository;
import com.innoventes.test.app.repository.Log_interface;

@Service
public class Employeeservice {
@Autowired
private Employeerepository er;
@Autowired
private  Employee_mapper cmpr;
@Autowired
private Log_interface lin;
@Autowired
private Employee_mapper empmapper;
//.......................authentication.............
public boolean authentic(Map<String,String> semap)
{
	String s1=semap.get("userid");
	Integer lo=Integer.parseInt(s1);
	Login lw=lin.findById(lo).get();
	String sd=lw.getSessionid();
	if(sd.equals(semap.get("sessionid")))
	{
		
		return true;
	}	
	return false;
}
//...............save.............//........
public Employee_Dto save(EmployeeEntity emp)
{
         er.save(emp);
		 Employee_Dto   e1=empmapper. getEmployeedto(emp);
		return e1;			
}
//......................saveall.....................//
public List<Employee_Dto> saveall(List<EmployeeEntity> emp)//we can give in place of saveall to anything(rabbit)
{
	 er.saveAll(emp);
	 List<Employee_Dto> e2= empmapper.getEmployeedtoList(emp);
	return e2;
}
//............................getbyid...................//
public Employee_Dto getid(Integer id)
{
	EmployeeEntity res= er.findById(id).orElse(null);
	Employee_Dto re1=cmpr.getEmployeedto(res);
	return re1;
}
//..........................deletebyid...................//
//public List<Employee_Dto> delid(Integer emp)
public String delid(Integer emp)
{
    er.deleteById(emp);
//   List <EmployeeEntity>   ese=er.findAll();
//   List<Employee_Dto> e2= cmpr.getEmployeedtoList(ese);
return "deleted successfully..................#$%^&";
}
public String update(EmployeeEntity emp)
{
		if(er.existsById(emp.getEmployeeid()))
		{
		er.save(emp);
		return "updated.....................!!!!";
	    }
	return "not up.dated!!!!!";
}
public List<EmployeeEntity> findall()
{
  return er.findAll();
}


}
