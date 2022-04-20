package com.iu.boot3.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.boot3.util.FileManger;

@Service
public class MemberSerive {
	
	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private FileManger fileManger;
	
	//join
	public int join(MemberVO memberVO) throws Exception{
		return memberMapper.join(memberVO);
		
	}
	
	//login
	public MemberVO login(MemberVO memberVO)throws Exception{
		return memberMapper.login(memberVO);	
	}
	
	//delete (회원탈퇴)
	public int delete(MemberVO memberVO)throws Exception{
		return memberMapper.delete(memberVO);	
	}
	
	//mypage
	public MemberVO mypage(MemberVO memberVO)throws Exception{
		return memberMapper.mypage(memberVO);
	}
	
	//update
	public int update(MemberVO memberVO)throws Exception{
		return memberMapper.update(memberVO);
	}
	
	//addfile
	public int addFile(MemberFilesVO memberFilesVO, MultipartFile file)throws Exception{
		return memberMapper.addFile(memberFilesVO);
	}

}
