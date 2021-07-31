package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@SpringBootApplication
public class StudentInfoCrudApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoCrudApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Student student1 = new Student("Ankit","Singh","01January2000","ankit@gmail.com","Palam New Delhi","9999640012");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Rahul","Kumar","10January2010","rahul123@gmail.com","Sargar Pur","9899884411");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Kapil","Sharma","04March2008","ankit@gmail.com","Najafgarh","9643598891");
//		studentRepository.save(student3);
//		
	}

}
