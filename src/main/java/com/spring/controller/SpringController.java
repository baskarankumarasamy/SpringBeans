package com.spring.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.services.RetrieveRestServices;

@Controller
public class SpringController {

	//@Autowired	
	RetrieveRestServices retrieveRestServices;	
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3><h2>This message is coming from SpringController.java **********</h2></div><br><br>";
		
		return new ModelAndView("welcome", "message", message);	
	}
	
	@RequestMapping("/dataList")
	public ModelAndView dataList() {
		retrieveRestServices = new RetrieveRestServices();
		List<String> data=new ArrayList<String>();
		
		List<LinkedHashMap> emps = retrieveRestServices.getEmployee();
        
        for(LinkedHashMap map : emps){
        	data.add(map.get("id").toString());
        	data.add(map.get("name").toString());
        	data.add(map.get("createdDate").toString());
			
		}
        
        /*
        data.add("393554");
        data.add("Smith");
        data.add("08/14/2017");*/
		return new ModelAndView("dataList", "listData", data);
	}
}
	