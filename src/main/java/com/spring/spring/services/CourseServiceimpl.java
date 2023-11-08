package com.spring.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.spring.Dao.CourseDao;
import com.spring.spring.entity.Course;

@Service // its working on service layer
public class CourseServiceimpl implements Courseservice {
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getcourse(long courseId) {
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addcourse(Course course) {

		courseDao.save(course);
		return course;
	}

	@Override
	public Course updatecourse(Course course) {

		courseDao.save(course);
		return course;
	}

	@Override
	public void deletecourse(long parseLong) {

		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
}
