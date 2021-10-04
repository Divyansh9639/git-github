package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	private Student student;
	
	@Autowired
	private StudentRepo studentRepo;

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String insertFields(ModelMap model,@RequestParam String name,@RequestParam(required=false,name="subject") String subject) {
		student.setName(name);
		student.setSubject(subject);
		studentRepo.save(student);
		model.put("name",name);
		model.put("subject",subject);
		return "welcome";
	}
	
	@GetMapping("/find")
	public String fetchRecordsById(@RequestParam int id,ModelMap model) {
		Optional<Student> student1=studentRepo.findById(id);
		Student student2=student1.get();
		model.put("name", student2.getName());
		model.put("subject", student2.getSubject());
		return "find";
	}
}
