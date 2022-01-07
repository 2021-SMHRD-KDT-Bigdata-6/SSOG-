package kr.ssog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ssog.domain.User;
import kr.ssog.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
    UserMapper mapper;

    public User login(User vo) {
	User user = mapper.login(vo);
	return user;
    }
    public void join(User vo){
        mapper.join(vo);
}
    public void memberUpdate(User vo){
	mapper.memberUpdate(vo);
}
}
