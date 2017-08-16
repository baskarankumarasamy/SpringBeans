package com.spring.services;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

//@Component
public class RetrieveRestServices {

	public static final String SERVER_URI = "http://localhost:8081/SpringRestExample";
	
	public List<LinkedHashMap> getEmployee(){
		
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		
		return  restTemplate.getForObject(SERVER_URI+"/rest/emps", List.class);		
		
	}
}
