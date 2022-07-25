package com.marondal.ex.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.ex.ajax.model.NewUser;

@Repository
public interface NewUserDAO {
	
	// new_user 테이블 모든 행 가져오기 
	public List<NewUser> selectUserList();
	
	public int insertUser(
			@Param("name") String name
			,@Param("birthday") String birthday
			,@Param("introduce") String introduce
			,@Param("email") String email);
	
	// name 
	// SELECT count(1) FROM `new_user` WHERE `name` =  '김인규';
	public int selectCountByName(@Param("name") String name);

}
