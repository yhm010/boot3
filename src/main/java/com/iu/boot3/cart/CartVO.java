package com.iu.boot3.cart;

import java.sql.Date;

import lombok.Data;

@Data
public class CartVO {
	
	private Long cartNum;
	private String id;
	private Long productNum;
	private Long count;
	private Date regDate;
	

}
