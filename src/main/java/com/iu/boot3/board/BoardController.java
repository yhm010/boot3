package com.iu.boot3.board;

import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.boot3.util.Pager;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@ModelAttribute("board")
	public String getBoard() {
		return "board";
	}
	@GetMapping("fileDown")
	public ModelAndView getFileDown(BoardFilesVO boardFilesVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		boardFilesVO = boardService.getFileDetail(boardFilesVO);
		
		// 속성명은 파일다운 클래스에서 사용하는 이름과 동일하게
		mv.addObject("fileVO", boardFilesVO);
		// 클래스의 이름과 동일하게
		mv.setViewName("fileDown");
		return mv;
	}
	
	@GetMapping("list")
	public ModelAndView list(Pager pager)throws Exception{
		ModelAndView mv = new ModelAndView();
		List<BoardVO> ar = boardService.getList(pager);
		mv.setViewName("board/list");
		mv.addObject("list", ar);
		mv.addObject("pager", pager);
		return mv;
	}
	
	 @GetMapping("add")
	   public ModelAndView add()throws Exception{
	      ModelAndView mv = new ModelAndView();
	      mv.setViewName("board/add");
	      return mv; 
	   }
	   
	   @PostMapping("add")
	   public ModelAndView add(BoardVO boardVO,MultipartFile[] files)throws Exception{
	      ModelAndView mv = new ModelAndView();
	      int result = boardService.setAdd(boardVO,files);
	      mv.setViewName("redirect:./list");
	      return mv; 
	   }
	   
	   @GetMapping("detail")
	   public ModelAndView getDatail(BoardVO boardVO)throws Exception{
		   ModelAndView mv = new ModelAndView();
		   boardVO = boardService.getDetail(boardVO);
		   mv.addObject("board/detail");
		   mv.addObject("vo", boardVO);
		   return mv;
		   
	   }
	   
	   @GetMapping("update")
	   public String setUpdate(BoardVO boardVO, Model model)throws Exception{
		   boardVO = boardService.getDetail(boardVO);
		   model.addAttribute("vo", boardVO);
		   return "board/update";
	   }
	   
	   @PostMapping("update")
	   public ModelAndView setUpdate(BoardVO boardVO)throws Exception{
		   ModelAndView mv = new ModelAndView();
		 int result = boardService.setUpdate(boardVO);
		 System.out.println(boardVO.getTitle());
		 System.out.println(boardVO.getContents());
		 System.out.println(boardVO.getNum());
		 System.out.println(boardVO.getWriter());
		 mv.setViewName("redirect:./list");
		 return mv;
	   }
	   
	   @GetMapping("delete")
	   public ModelAndView setDelete(BoardVO boardVO)throws Exception{
		   int result = boardService.setDelete(boardVO);
		   ModelAndView mv = new ModelAndView();
		   mv.setViewName("redirect:./list");
		return mv;
	   }
	   
	

	
}
