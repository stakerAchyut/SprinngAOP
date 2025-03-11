package com.akshat.aop;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.akshat.layer.service.StudentService;
import com.akshat.model.Student;

@SpringBootApplication(scanBasePackages = "com.akshat")
public class SpringAopApplication {

	public static void main(String[] args) {
		ApplicationContext con = SpringApplication.run(SpringAopApplication.class, args);
		
		StudentService service = (StudentService) con.getBean("studentService");
		
		service.addStudents();
		
		List<Student> list = service.getStudents();
		
		list.forEach(System.out::println);
	}

}
