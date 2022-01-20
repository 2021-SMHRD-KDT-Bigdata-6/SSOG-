package kr.ssog.mapper;

public interface LogCountMapper {
	public void createLogTable(String user_id, String food_name);
	
	public void plusLogCount(String user_id, String food_name);
}
