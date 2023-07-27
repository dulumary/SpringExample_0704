package com.marondal.spring.ex.jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.jpa.domain.Student;
import com.marondal.spring.ex.jpa.repository.StudentRepository;
import com.marondal.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/create")
	@ResponseBody
	public Student createStudent() {
		
		String name = "김인규";
		String phoneNumber = "01012345678";
		String email = "lecture@hagulu.com";
		String dreamJob = "개발자";
		
		Student student = studentService.addStudent(name, phoneNumber, email, dreamJob);
		
		return student;
	}
	
	@GetMapping("/update")
	@ResponseBody
	public Student updateStudent() {
		// id 3인 데이터의 장래희망을 강사로 변경 
		Student student = studentService.updateStudentDreamJob(3, "강사");
		
		return student;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteStudent() {
		
		// id가 3인 행 삭제 
		studentService.deleteStudent(3);
		
		return "삭제 성공";
		
	}
	
	@GetMapping("/select")
	@ResponseBody
	public List<Student> selectStudent() {
		
		// 모든 행 조회 
//		List<Student> studentList = studentRepository.findAll();	
		
		// id 기준으로 내림 차순 전체 조회 
//		List<Student> studentList = studentRepository.findAllByOrderByIdDesc();
		
		// id 기준 내림차순 하나만 조회 
//		List<Student> studentList = studentRepository.findTop1ByOrderByIdDesc();
		
		// 전달한 이름과 일치하는 데이터만 조회 
//		List<Student> studentList = studentRepository.findByName("유재석");
		
		// 이름 목록과 일치하는 모든 데이터 조회 
		// 유재석, 조세호 
//		List<String> nameList = new ArrayList<>();
//		nameList.add("유재석");
//		nameList.add("조세호");
//		List<Student> studentList = studentRepository.findByNameIn(nameList);
		
		// 이메일에 naver가 포함된 학생 조회 
//		List<Student> studentList = studentRepository.findByEmailContaining("naver");
		
		// 이름이 유씨인 학생 조회
//		List<Student> studentList = studentRepository.findByNameStartingWith("조");
		
		// id 1 ~ 3 범위 조회 
		List<Student> studentList = studentRepository.findByIdBetweenOrderByIdDesc(1, 3);
		
		return studentList;
	}
	
	
	@ResponseBody
	@GetMapping("/native")
	public List<Student> nativeStudent() {
		// 장래희망이 변호사인 데이터 조회 
		List<Student> studentList = studentRepository.findByDreamJobNative("변호사");
		return studentList;
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("/lombok/test")
	@ResponseBody
	public void test() {
		
//		Student student = new Student();
//		student.setName("김인규");
//		student.setDreamJob("개발자");
//		student.setPhoneNumber("010-1234-5678");
		Student student = Student.builder()
				.name("김인규")
				.dreamJob("개발자")
				.phoneNumber("010-1234-5678")
				.build();
		
		
		System.out.println(student);
		
		
		
	}

}
