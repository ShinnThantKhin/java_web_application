package com.lap.crud.controller;

import org.springframework.stereotype.Controller;
import com.lap.crud.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import com.lap.crud.entity.Course;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CourseController {

	@Autowired
	private CourseService service;
	
	@GetMapping("/course/{id}")
	public String course(Model model, @PathVariable long id) {
		Course course = new Course();
		if(id != 0) {
			course = service.findById(id);
		}
		model.addAttribute("course", course);
		return "course";
	}
	
	@GetMapping("/courses")
	public String courses (Model model) {
		List<Course> courses = service.findAll();
		model.addAttribute("courses", courses);
		return "courses";
	}
	
	@PostMapping("/course/save")
	public String save (@ModelAttribute("course") Course course) {
		service.save(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/course/delete/{id}")
	public String delete(@PathVariable long id) {
		service.delete(service.findById(id));
		return "redirect:/courses";
	}
	
}
