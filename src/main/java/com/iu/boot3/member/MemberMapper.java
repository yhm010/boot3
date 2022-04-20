package com.iu.boot3.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	
	//join
	public int join(MemberVO memberVO)throws Exception;
	
	//login
	public MemberVO login(MemberVO memberVO) throws Exception;
	
	//mypage
	public MemberVO mypage(MemberVO memberVO)throws Exception;

	//update
	public int update(MemberVO memberVO)throws Exception;

	//delete
	public int delete(MemberVO memberVO)throws Exception;
	
	//addfile
	public int addFile(MemberFilesVO memberFilesVO) throws Exception;
}
