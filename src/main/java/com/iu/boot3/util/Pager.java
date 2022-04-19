package com.iu.boot3.util;

import lombok.Data;

@Data
public class Pager {
	
	// DB에서 몇개씩 조회? (파라미터의 값 가능)
	private Integer perPage;
	// DB에서 조회할 시작 인덱스 번호
	private Integer startRow;
	
	//페이지 번호 (파라미터의 값)
	private Integer pn;
	
	// 검색어 (파라미터의 값)
	private String search;
	
	// 검색 종류 (파라미터의 값)
	private String kind;
	
	//JSP 사용 변수
	private Long startNum;
	private Long lastNum;
	
	private boolean pre;
	private boolean next;
	
	public void makeRow() {
		//pn : 1, perPage : 10, startRow : 0
		//pn : 2, perPage : 20, startRow : 10
		//pn : 3, perPage : 30, startRow : 20
		this.startRow = (this.getPn()-1) * this.getperpage();
		this.perPage = (this.getPn() * this.getperpage());
	}
	
	public void makeNum(Long totalCount) {
		Long totalpage = totalCount / this.getperpage();
		if(totalCount % this.getperpage() !=0) {
			totalpage++;
		}
		
		Long perBlock = 10L;
		Long totalBlock = totalpage / perBlock;
		if(totalpage % perBlock !=0) {
			totalBlock++;
		}	
		
		Long curBlock = getperpage()/perBlock;
		if(this.getperpage() % perBlock !=0) {
			curBlock++;
		}
		
		this.startNum = (curBlock -1) * perBlock +1;
		this.lastNum = curBlock * perBlock;
		
		this.pre = false;
		if(curBlock > 1) {
			this.pre = true;
		}
		
		this.next = false;
		if(totalBlock > curBlock) {
			this.next = true;
		}
		if (curBlock == totalBlock) {
			this.lastNum = totalpage;
		}
		
		if(totalCount==0) {
			this.lastNum=0L;
		}
		
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
