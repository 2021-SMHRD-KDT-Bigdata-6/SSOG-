package kr.ssog.mapper;

import kr.ssog.domain.User;

public interface UserMapper {

	public User login(User vo);
    public void join(User vo);
    public void memberUpdate(User vo);
}
