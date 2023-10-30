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
		
		Course entity =courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
}
	//List<Course> list;

//	public CourseServiceimpl() {
	//	list = new ArrayList<>();
	//	list.add(new Course(145, "java core couse", "this contains basic pof java"));
	//	list.add(new Course(125, "springboot", "this contains springboot"));
	//}

	//@Override
	//public List<Course> getCourses() {
		//return list;
	

	//@Override
	/*
	 * public Course getcourse(long courseId) { Course c = null; for (Course course
	 * : list) { if (course.getId() == courseId) { c = course; break; } }
	 * 
	 * return c; }
	 */

	//@Override
	/*
	 * public Course addcourse(Course course) { list.add(course); return course; }
	 */

	//@Override
	/*
	 * public Course updatecourse(Course course) {
	 * 
	 * list.forEach(e->{ if(e.getId()==course.getId()) {
	 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
	 * });
	 * 
	 * return course; }
	 */
	//@Override
	/*
	 * public void deletecourse(long parseLong) { list=this.list.stream()
	 * .filter(e-> e.getId()!=parseLong).collect(Collectors.toList()); }
	 */
