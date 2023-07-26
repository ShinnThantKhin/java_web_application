package com.lap.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lap.crud.entity.Course;

public interface CourseRepository extends JpaRepository <Course, Long> {

	
}
