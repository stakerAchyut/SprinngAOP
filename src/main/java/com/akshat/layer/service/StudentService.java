package com.akshat.layer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akshat.layer.repository.StudentRepo;
import com.akshat.model.Student;

@Service("studentService")
public class StudentService {

	StudentRepo repo;

	public StudentRepo getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}
	
	public void addStudents() {
		repo.addStudentsRepo();
	}
	
	public List<Student> getStudents() {
		return repo.getStudentsRepo();
	}
}
