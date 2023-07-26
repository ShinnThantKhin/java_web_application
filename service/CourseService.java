package com.lap.crud.service;

import com.lap.crud.entity.Course;
import com.lap.crud.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repository;

	public void save(Course course) {
		repository.save(course);
	}
	
	public void delete(Course course) {
		repository.delete(course);
	}
	
	public Course findById(long id) {
		return repository.findById(id).get();
	}
	
	public List<Course> findAll(){
		return repository.findAll();
	}
	
}
