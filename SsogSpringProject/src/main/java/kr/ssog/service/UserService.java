package kr.ssog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.t_member;
import kr.ssog.mapper.FoodMapper;
import kr.ssog.mapper.LogCountMapper;
import kr.ssog.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
    UserMapper mapper;
	@Autowired
	LogCountMapper logMapper;
	@Autowired
	FoodMapper foodMapper;

    public t_member login(t_member vo) {
    	t_member user = mapper.login(vo);
	return user;
    }
    public void join(t_member vo){
        mapper.join(vo);
    }
    public void memberUpdate(t_member vo){
    	mapper.memberUpdate(vo);
    }
    // 아이디중복체크
    public int idCheck(t_member vo) {
    	int result = mapper.idCheck(vo);
    	return result;
    }
    
    
    //로그 테이블 만들기
    public void createLogTable(t_member vo) {
    	List<String> foodNames= foodMapper.getFoodName();
    	for(int i =0; i<foodNames.size(); i++) {
    		logMapper.createLogTable(vo.getMb_id(), foodNames.get(i));
    	}
    }
    
    
    //로그 기록 더하기
    public void plusLogCount(t_member vo, String food_name) {
    	System.out.println(food_name);
    	System.out.println(vo);
    	logMapper.plusLogCount(vo.getMb_id(), food_name);
    }
}
