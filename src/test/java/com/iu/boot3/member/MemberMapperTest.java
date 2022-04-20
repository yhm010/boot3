package com.iu.boot3.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MemberMapperTest {
	
	@Autowired
	private MemberMapper memberMapper;

	//@Test
	void join() throws Exception{
		MemberVO memberVO = new MemberVO();
		memberVO.setId("id");
		memberVO.setPw("pw");
		
		int result= memberMapper.join(memberVO);
		
		assertEquals(1, result);
	}
	
	//@Test
	void login()throws Exception{
		
		
	}

	@Test
	void mypage()throws Exception{
		
	}
	
	@Test
	void update()throws Exception{
		
	}
	
	@Test
	void delete()throws Exception{
		
	}

}