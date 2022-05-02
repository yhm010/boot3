package com.iu.boot3.member;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MemberVO {
	@NotBlank(message="ID는 필수입니다")
	private String id;
	@Size(min=3, max=12, message="pw는 3글자 이상 12글자 이하")
	private String pw;
	private String name;
	private String email;
	private String phone;
	
	private MemberFilesVO memberFilesVO;
	
	private List<RoleVO> roleVOs;
	
	

}