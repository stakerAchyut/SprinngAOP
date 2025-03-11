package com.akshat.layer.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.akshat.model.Student;

@Repository("repo")
public class StudentRepo {

	List<Student> list = new ArrayList<>();;
	
	public void addStudentsRepo() {
		this.list.add(new Student(1, "Akshat", "IT"));
		this.list.add(new Student(2, "Anand", "IT"));
		this.list.add(new Student(3, "Tanmay", "Civil"));
		this.list.add(new Student(4, "Saurav", "MCA"));
		this.list.add(new Student(5, "Deepak", "MBA"));		
	}
	
 	public List<Student> getStudentsRepo() {
 		return this.list;
	}
}
