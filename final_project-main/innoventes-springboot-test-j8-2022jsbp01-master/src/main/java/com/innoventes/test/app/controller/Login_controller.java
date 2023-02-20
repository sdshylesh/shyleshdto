package com.innoventes.test.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.innoventes.test.app.entity.Login;
import com.innoventes.test.app.service.Log_service;

@Controller
@RequestMapping("/log")
public class Login_controller {
	@Autowired
	private Log_service loser;
	@PostMapping("/create") 
	public ResponseEntity<String> create(@RequestBody Login emp)
	{
		Login l1=loser.create(emp);
		if(l1!=null)
		{
		
			return ResponseEntity.status(200).body("saved...........Sisya..!!!");
		}
		else
		{
			return ResponseEntity.status(400).body(null);
		}
	}
	@RequestMapping("/session")
	public ResponseEntity<String> getsession(@RequestHeader Map<String,String> mapp)
	{
		String s1=loser.getsession(mapp);
		return ResponseEntity.status(200).body(s1);
		
	}
	

}
