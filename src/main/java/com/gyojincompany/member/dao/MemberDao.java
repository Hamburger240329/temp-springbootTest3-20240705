package com.gyojincompany.member.dao;

public interface MemberDao {
	
	public void joinDao(String mid, String mpw, String mname, String memail);//회원 가입
	public int checkIdDao(String mid);//회원가입여부 확인

}
