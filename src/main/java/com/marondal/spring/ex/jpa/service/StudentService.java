package com.marondal.spring.ex.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.jpa.domain.Student;
import com.marondal.spring.ex.jpa.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student addStudent(String name, String phoneNumber, String email, String dreamJob) {
		
		Student student = Student.builder()
				.name(name)
				.phoneNumber(phoneNumber)
				.email(email)
				.dreamJob(dreamJob)
				.build();
		
		student = studentRepository.save(student);
		return student;
		
	}
	
	public Student updateStudentDreamJob(int id, String dreamJob) {
		// update 대상이되는 행을 조회 한다. 
		// 조회된 객체에서 필요한 멤버변수를 수정한다. 
		// 해당 객체를 저장한다. 
		
		// Optional<Student> 
		// null일수도 있는 객체를 리턴할때 사용하는 클래스 
		Optional<Student> optionalStudent = studentRepository.findById(id);
		Student student = optionalStudent.orElse(null);
		
		if(student != null) {
			student = student.toBuilder()
			.dreamJob(dreamJob)
			.build();
			
			student = studentRepository.save(student);
		}
		
		return student;
		
	}
	
	
	public void deleteStudent(int id) {
		// 삭제 대상의 객체를 얻온다. 
		// 객체를 기반으로 삭제 한다. 
//		Student student = studentRepository.findById(id).orElse(null);
//		
//		if(student != null) {
//			studentRepository.delete(student);
//		}
		
		Optional<Student> optionalStudent = studentRepository.findById(id);
		// 람다식 
		optionalStudent.ifPresent(student -> studentRepository.delete(student));
		
	}
	

}
