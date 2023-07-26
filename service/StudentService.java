package com.lap.crud.service;

import com.lap.crud.entity.Student;
import com.lap.crud.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public void save(Student student) {
		repository.save(student);
	}
	
	public void delete(Student student) {
		repository.delete(student);
	}
	
	public Student findById(long id) {
		return repository.findById(id).get();
	}
	
	public List<Student> findAll(){
		return repository.findAll();
	}
	
}
