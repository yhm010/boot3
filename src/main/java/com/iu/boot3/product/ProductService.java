package com.iu.boot3.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.boot3.util.FileManger;
import com.iu.boot3.util.Pager;

@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private FileManger fileManger;
	
	public List<ProductVO> list(Pager pager)throws Exception{
		pager.makeRow();
		return productMapper.list(pager);
	}
	
	public int add(ProductVO productVO, MultipartFile [] files) throws Exception{
		System.out.println("인서트 전 : " + productVO.getProductName());
		int result = productMapper.add(productVO);
		System.out.println("인서트 후 : " + productVO.getProductName());
		
		if(files !=null)
		for(MultipartFile mf : files) {
			if(mf.isEmpty()) {
				continue;
			}
			String fileName = fileManger.fileSave(mf, "resources/upload/product");
			System.out.println(fileName);
			ProductFilesVO productFilesVO = new ProductFilesVO();
			productFilesVO.setProductNum(productVO.getProductNum());
			productFilesVO.setFileName(fileName);
			productFilesVO.setOriName(mf.getOriginalFilename());
			productMapper.FileAdd(productFilesVO);
		}
		return result;
	
	} 

}