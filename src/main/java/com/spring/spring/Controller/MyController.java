package com.spring.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.entity.Course;
import com.spring.spring.services.Courseservice;

@RestController
public class MyController {
	@Autowired // creating object
	private Courseservice CourseService;

	@GetMapping("/home")
	public String home() {
		return "welcome to the couse application";

	}

	// get the courses

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.CourseService.getCourses();
	}

//get the course by using id
	@GetMapping("/courses/{courseId}") // use of {} means to get value of id
	public Course getCourse(@PathVariable String courseId) {
		return this.CourseService.getcourse(Long.parseLong(courseId));
	}

	// add the course
	@PostMapping("/courses")
	public Course addcourse(@RequestBody Course course) {
		return this.CourseService.addcourse(course);
	}

//update course using put request
	@PutMapping("/courses")
	public Course updatecourse(@RequestBody Course course) {
		return this.CourseService.updatecourse(course);
	}

//delete the course

	@DeleteMapping("/courses/{courseId}")
	public void deletecourse(@PathVariable String courseId) {
		try {
			this.CourseService.deletecourse(Long.parseLong(courseId));
		} catch (Exception e) {
			return;

		}

	}

}
