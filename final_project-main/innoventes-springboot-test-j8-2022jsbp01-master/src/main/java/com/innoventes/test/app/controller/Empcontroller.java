package com.innoventes.test.app.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innoventes.test.app.dto.Employee_Dto;
import com.innoventes.test.app.entity.EmployeeEntity;
import com.innoventes.test.app.mapper.Employee_mapper;
import com.innoventes.test.app.service.Employeeservice;
@Controller
@RequestMapping("/dd")
public class Empcontroller {
	
	@Autowired
	private Employeeservice eser;
	@Autowired
	private Employee_mapper empmapper;

	@PostMapping("/save") 
	public ResponseEntity<Employee_Dto> save(@RequestBody EmployeeEntity emp,@RequestHeader Map<String,String> semap)
	{

//           Employee_Dto   e1=eser.save(emp, semap);
           Employee_Dto   e1=eser.save(emp);
		boolean t=eser.authentic(semap);
		if(e1!=null && t==true)
		{
			return ResponseEntity.status(200).body(e1);
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
		
	}
	@RequestMapping("/saveall")
	 public ResponseEntity<List<Employee_Dto>> saveall(@RequestBody List<EmployeeEntity> emp,@RequestHeader Map<String,String> semap)//requestbody used to get the data from body(bigbox)
	 {
		List<Employee_Dto> e2= eser.saveall(emp);
           boolean q=eser.authentic(semap);
				 if(e2!=null && q==true)
					{
						return ResponseEntity.status(200).body(e2);
					}
					else
					{
						return ResponseEntity.status(400).body(null);
					}
	 }
	@RequestMapping("/get/{id}")
	public ResponseEntity<Employee_Dto> getid(@PathVariable int id,@RequestHeader Map<String,String> semap)
	{
		 boolean q=eser.authentic(semap);
		Employee_Dto e3=eser.getid(id);
		if(e3!=null && q==true)
		{
			return ResponseEntity.status(200).body(e3);
		}
		return ResponseEntity.status(400).body(null);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delid(@PathVariable int id,@RequestHeader Map<String,String> semap)
	{
		 boolean w=eser.authentic(semap);
//		List<Employee_Dto> e4=eser.delid(id);
		String e4=eser.delid(id);
		if(e4!=null && w==true)
		{
			return ResponseEntity.status(200).body(e4);
		}
		return ResponseEntity.status(400).body(null);
	}
	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody EmployeeEntity emp,@RequestHeader Map<String,String> semap)
	{
	      String t=eser.update(emp);
	      boolean w=eser.authentic(semap);
	      if(w==true)
	      {
	    	  return ResponseEntity.status(200).body(t);  
	      }
	      return ResponseEntity.status(400).body(null);	
	}
	@RequestMapping("/findall")
	public ResponseEntity<List<EmployeeEntity>> findall()
	{
		return ResponseEntity.ok(eser.findall());	
	}
	}


