package com.journaldev.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.journaldev.spring.service.EmployeeService;

public class SpringMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Spring Context initialized");
		
		EmployeeService service = ctx.getBean("employeeService", EmployeeService.class);
		System.out.println("Bean retrieved from Spring Context");
		System.out.println("Employee Name : " + service.getEmployee().getName());
		ctx.close();
		System.out.println("Spring Context Closed");
	}
}
