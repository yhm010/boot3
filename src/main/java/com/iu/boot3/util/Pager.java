package com.iu.boot3.util;

import lombok.Data;

@Data
public class Pager {
	
	// DB에서 몇개씩 조회? (파라미터의 값 가능)
	private Integer perPage;
	// DB에서 조회할 시작 인덱스 번호
	private Integer StartRow;
	
	//페이지 번호 (파라미터의 값)
	private Integer pn;
	
	// 검색어 (파라미터의 값)
	private String search;
	
	// 검색 종류 (파라미터의 값)
	private String kind;
	
	public void makeRow() {
		//pn : 1, perPage : 10, startRow : 0
		//pn : 2, perPage : 20, startRow : 10
		//pn : 3, perPage : 30, startRow : 20
		this.StartRow= (this.getPn()-1) * this.getperpage();
		
	}
	
	public Integer getPn() {
		if(this.pn == null || this.pn<1) {
			this.pn=1;
		}
		return this.pn;
	}
	
	public Integer getperpage() {
		if(this.perPage == null || this.perPage < 1) {
			this.perPage=10;
		}
		return this.perPage;
	}
	
	//GETTER : get+멤버변수명, 멤버변수명의 첫글자는 대문자
	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		return search;
	
	}
	//SETTER : set+멤버변수명, 멤버변수명의 첫글자는 대문자
	public void setSearch(String search) {
		this.search = search;
	}
		
		
	}
