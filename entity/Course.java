package com.lap.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long courseId;
		
		private String courseName;
		
		private String lecturerName;
	
		private String acedamicYear;

		private String department;
		
		private String courseType;
		
		public long getCourseId() {
			return courseId;
		}

		public void setCourseId(long courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getLecturerName() {
			return lecturerName;
		}

		public void setLecturerName(String lecturerName) {
			this.lecturerName = lecturerName;
		}

		public String getAcedamicYear() {
			return acedamicYear;
		}

		public void setAcedamicYear(String acedamicYear) {
			this.acedamicYear = acedamicYear;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getCourseType() {
			return courseType;
		}

		public void setCourseType(String courseType) {
			this.courseType = courseType;
		}
		
}
