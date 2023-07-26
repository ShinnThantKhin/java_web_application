package com.lap.crud.controller;

import org.springframework.stereotype.Controller;
import com.lap.crud.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import com.lap.crud.entity.Teacher;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TeacherController {

	@Autowired
	private TeacherService service;
		
		@GetMapping("/teacher/{id}")
		public String teacher(Model model, @PathVariable long id) {
			Teacher teacher = new Teacher();
			if(id != 0) {
				teacher = service.findById(id);
			}
			model.addAttribute("teacher", teacher);
			return "teacher";
		}
		
		@GetMapping("/teachers")
		public String teachers (Model model) {
			List<Teacher> teachers = service.findAll();
			model.addAttribute("teachers",teachers);
			return "teachers";
		}
		
		@PostMapping("/teacher/save")
		public String save (@ModelAttribute("teacher") Teacher teacher) {
			service.save(teacher);
			return "redirect:/teachers";
		}
		
		@GetMapping("/teacher/delete/{id}")
		public String delete(@PathVariable long id) {
			service.delete(service.findById(id));
			return "redirect:/teachers";
		}
	
}
