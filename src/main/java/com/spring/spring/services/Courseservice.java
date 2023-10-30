package com.spring.spring.services;

import java.util.List;

import com.spring.spring.entity.Course;

public interface Courseservice {

	public List<Course> getCourses();

	public Course getcourse(long courseId);
	
	public Course addcourse(Course course);
	
	public Course updatecourse(Course course);
	
	public void deletecourse(long parseLong);
	
}
