package kr.ssog.mapper;

import org.apache.ibatis.annotations.Param;

public interface LogCountMapper {
	public void createLogTable(@Param("user_id") String user_id, @Param("food_name") String food_name);
	
	

	public void plusLogCount(@Param("user") String user_id, @Param("food") String food_name);
}
