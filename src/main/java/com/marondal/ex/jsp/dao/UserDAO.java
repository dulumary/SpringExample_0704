package com.marondal.ex.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
	
	public int insertUser(
			@Param("name") String name
			,@Param("yyyymmdd") String yyyymmdd
			,@Param("introduce") String introduce
			,@Param("email") String email);

}
