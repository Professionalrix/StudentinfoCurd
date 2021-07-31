package com.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.entity.Course;

@Service
public interface CourseService {
	
	List<Course> getAllCourses();
	

}
