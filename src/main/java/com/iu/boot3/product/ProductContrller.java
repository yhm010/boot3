package com.iu.boot3.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.boot3.util.Pager;

@Controller
@RequestMapping("/product/*")
public class ProductContrller {
	
	@Autowired
	private ProductService productService;
	
	@ModelAttribute("product")
	public String getProduct() {
		return "product";
	}
	
	@GetMapping("list")
	public ModelAndView list(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<ProductVO> ar = productService.list(pager);
		mv.setViewName("product/list");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		return mv;
	}
	
	@GetMapping("add")
	public ModelAndView add()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product/add");
		return mv;
	}
	
	@PostMapping("add")
	public ModelAndView add(ProductVO productVO, MultipartFile [] files)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = productService.add(productVO, files);
		mv.setViewName("redirect:./list");
		return mv;
	}
	

}
