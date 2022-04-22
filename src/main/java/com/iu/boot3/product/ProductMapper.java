package com.iu.boot3.product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iu.boot3.util.Pager;

@Mapper
public interface ProductMapper {
	
	public List<ProductVO> list(Pager pager)throws Exception;
	
	public int add(ProductVO productVO)throws Exception;
	
	public int fileAdd(ProductFilesVO productFilesVO)throws Exception;

	public Long totalCount(Pager pager) throws Exception;
}