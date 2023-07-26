package com.lap.crud.controller;

import org.springframework.stereotype.Controller;
import com.lap.crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import com.lap.crud.entity.Student;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/student/{id}")
	public String student(Model model, @PathVariable long id) {
		Student student = new Student();
		if(id != 0) {
			student = service.findById(id);
		}
		model.addAttribute("student", student);
		return "student";
	}
	
	@GetMapping("/students")
	public String students (Model model) {
		List<Student> students = service.findAll();
		model.addAttribute("students",students);
		return "students";
	}
	
	@PostMapping("/student/save")
	public String save (@ModelAttribute("student") Student student) {
		service.save(student);
		return "redirect:/students";
	}
	
	@GetMapping("/student/delete/{id}")
	public String delete(@PathVariable long id) {
		service.delete(service.findById(id));
		return "redirect:/students";
	}
	
}
