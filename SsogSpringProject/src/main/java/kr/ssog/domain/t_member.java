package kr.ssog.domain;

import lombok.Data;

@Data
public class t_member {

	private String mb_id; 		//사용자아이디
	//private String mb_nick; // 추가??
	private String mb_pwd; 		// 비밀번호
	private String mb_name; 	// 이름
	private String mb_phone; 	// 연락처
	private String mb_addr;		// 주소
	// private int mb_age;
	private String mb_gender;	// 성별
	private String mb_joindate;	// 가입일자
	private String admin_yn;	// 관리자권한
}
