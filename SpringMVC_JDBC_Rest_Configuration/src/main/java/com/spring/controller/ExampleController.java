package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.ExampleBean;
import com.spring.dao.DataBaseDao;

@RestController
public class ExampleController {
	
	@RequestMapping(value = "/examples", method = RequestMethod.GET,headers="Accept=application/json")
	public List getExamples() {		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring-database.xml");
		DataBaseDao dao = (DataBaseDao) applicationContext.getBean("JdbcTemplate");		
		System.out.println(dao); //DataBase Connection comming jdbcTemplate
		
		List listOfExamples = new ArrayList();
		listOfExamples=createExampleList();
		return listOfExamples;
		
	}
	
	
	 @RequestMapping(value = "/example/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	 public ExampleBean getCountryById(@PathVariable int id)
	 {
	  List listOfCountries = new ArrayList();
	  listOfCountries=createExampleList();
	 
	  for (Object example: listOfCountries) {
	   if(((ExampleBean) example).getId()==id)
	    return (ExampleBean) example;
	  }
	  
	  return null;
	 }
	
	// Static Assign Examples
	 public List createExampleList()
	 {
	  ExampleBean ex1=new ExampleBean(1,"Java","It is a Programming Lang");
	  ExampleBean ex2=new ExampleBean(2,"Apple","It is a Fruit ");
	  ExampleBean ex3=new ExampleBean(3,"TajMahal","It is a Construction ");
	 
	  List listOfExamples = new ArrayList();
	  listOfExamples.add(ex1);
	  listOfExamples.add(ex2);
	  listOfExamples.add(ex3);
	 
	  return listOfExamples;
	 }

}
