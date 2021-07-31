package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.student.entity.Course;
import com.student.entity.Student;
import com.student.service.CourseService;
import com.student.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService studentService;
	@Autowired
	private CourseService courseService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		List<Student> studentList=studentService.getAllStudents();
	
		model.addAttribute("students",studentList);
		return "students";
				
	}
	
	@GetMapping("/students/new")
	public String addStudent(Model model) {
		System.out.println(model.getAttribute("course"));
		Student student = new Student();
		model.addAttribute("student", student);
		List<Course> courseList=courseService.getAllCourses();
		System.out.println(courseList.size());
		model.addAttribute("courses",courseList);
		
		return "add_student";
	}
	
	@PostMapping("/students")
	public String savaStudent(@ModelAttribute("student") Student student) {
		System.out.println(student.getCourses());
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String uddateStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		
		return "update_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student) {
		
		System.out.println("Narender");
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setDob(student.getDob());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setLastName(student.getLocation());
		existingStudent.setPhoneNo(student.getPhoneNo());
		
		
		
		
		studentService.saveStudent(existingStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
	
		System.out.println("deleting process");
		studentService.deleteStudentByID(id);
		return "redirect:/students";
	}
	
	
	public String courses(Model model) {
		
		Course course = new Course();
		model.addAttribute("courses",courseService.getAllCourses());
					
		return "redirect:/";
		
	}
	
	
	
}
