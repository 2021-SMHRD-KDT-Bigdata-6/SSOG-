package kr.ssog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.t_member;
import kr.ssog.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
    UserMapper mapper;

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
}
