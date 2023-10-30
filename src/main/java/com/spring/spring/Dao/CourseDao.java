package com.spring.spring.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.spring.entity.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
