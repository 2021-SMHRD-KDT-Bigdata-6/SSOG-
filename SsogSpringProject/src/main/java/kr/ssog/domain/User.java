package kr.ssog.domain;

import lombok.Data;

@Data
public class User {

	private String mb_id;
	private String mb_nick; // 추가??
	private String mb_pwd;
	private String mb_name;
	private String mb_phone;
	private String mb_addr;
	private String mb_gender;
	private String mb_joindate;
	private String admin_yn;
}
