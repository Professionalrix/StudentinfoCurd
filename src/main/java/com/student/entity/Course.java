package com.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentCourse")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="courseId")
	private Long id;
	private String course;
	private String courseDuration;
	
	
	
	public Course(Long id, String course, String courseDuration) {
		super();
		this.id = id;
		this.course = course;
		this.courseDuration = courseDuration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Course(String course) {
		super();
		this.course = course;
	}
	public Course() {
		super();
		
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public Course(String course, String courseDuration) {
		super();
		this.course = course;
		this.courseDuration = courseDuration;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", courseDuration=" + courseDuration + "]";
	}
	
}
