package com.marondal.spring.ex.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marondal.spring.ex.jpa.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// id를 기준으로 내림차순으로 정렬한 모든 행 데이터 
	public List<Student> findAllByOrderByIdDesc();
	
	// id를 기준으로 내림차순 정렬후 하나만 조회
	public List<Student> findTop1ByOrderByIdDesc();
	
	// name 컬럼이 일치하는 데이터 조회 
	public List<Student> findByName(String name);
	
	// 전달받은 이름들과 일치하는 데이터 조회 
	// `name` IN ('유재석', '조세호')
	public List<Student> findByNameIn(List<String> nameList);
	
	// email 컬럼에 특정 문자열이 포함된 데이터 조회 
	// `email` LIKE '%naver%'
	public List<Student> findByEmailContaining(String email);
	
	// 이름이 특정 문자열로 시작되는 데이터 조회
	// `name` LIKE '김%'
	public List<Student> findByNameStartingWith(String name);
	
	// id가 특정 값들의 사이에 대응되는 데이터를 Id 내림차순으로 조회 
	// BETWEEN 
	public List<Student> findByIdBetweenOrderByIdDesc(int start, int end);
	
	// 쿼리를 통해 특정 장래 희망을 가진 데이터 조회 
	@Query(value="SELECT * FROM `new_student` WHERE `dreamJob` = :dreamJob", nativeQuery=true)
	public List<Student> findByDreamJobNative(@Param("dreamJob") String dreamJob);
	
	
	
}
