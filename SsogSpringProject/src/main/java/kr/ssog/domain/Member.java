package kr.ssog.domain;

import lombok.Data;

@Data
public class Member {
	private int MID;
	private String MPassword;
	private String MName;
	private int MPhone;
	private String MAddress;
	private int MAge;
	private String MGender;
	private String MJoinDate;
	private String MAdmin;

}
