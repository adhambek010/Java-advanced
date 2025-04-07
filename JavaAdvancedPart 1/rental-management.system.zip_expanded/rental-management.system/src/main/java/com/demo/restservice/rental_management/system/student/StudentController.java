package com.demo.restservice.rental_management.system.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentController {
	@Autowired
	private StudentRepository repository;
	
	@PostMapping("/student/create")
	public Student creaStudent(@RequestBody Student student) {
		return repository.save(student);
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	@GetMapping("/students")
	public List<Student> getStudents(){
		return repository.findAll();
	}
}
