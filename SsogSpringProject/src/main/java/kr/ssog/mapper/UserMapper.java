package kr.ssog.mapper;

import org.apache.ibatis.annotations.Select;

import kr.ssog.domain.t_member;

public interface UserMapper {

	public t_member login(t_member vo);
    public void join(t_member vo);
    public void memberUpdate(t_member vo);
    // 아이디중복체크
    @Select("select count(*) from t_member where mb_id=#{mb_id}")
    public int idCheck(t_member vo);
}
