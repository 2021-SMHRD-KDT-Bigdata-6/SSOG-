package kr.ssog.mapper;

import kr.ssog.domain.t_member;

public interface UserMapper {

	public t_member login(t_member vo);
    public void join(t_member vo);
    public void memberUpdate(t_member vo);
}
