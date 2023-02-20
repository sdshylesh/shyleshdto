package com.innoventes.test.app.service;

import java.util.Date;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.innoventes.test.app.entity.Login;
import com.innoventes.test.app.repository.Log_interface;

@Service
public class Log_service {
	@Autowired
	private Log_interface loin;
	public Login create(Login emp)
	{
	  return loin.save(emp);
	}
	public String getsession(Map<String,String> mapp)
	{
		String t=mapp.get("userid");
		Integer lo=Integer.parseInt(t);
		 Login  l1=loin.findById(lo).get();
		 if(l1!=null)
		 {
			 if(l1.getPassword().equals(mapp.get("password")))
			 {
				 String session_id = "SID"+System.currentTimeMillis();
				 l1.setSessionid(session_id);
				 loin.save(l1);
				return "session id updated BOSS>..................!!";
			 }
			
		 }
		 return "data sari illa guru...........*****";
		
	}

}
