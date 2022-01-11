package kr.ssog.domain;

import lombok.Data;

@Data
public class LogCount {
	private int logSeq;		//로그번호
	private String mID;		//사용자아이디
	private String fdName;  //음식이름
	private String log;		//로그기록 유무
	private String logDate; //로그날짜
}
