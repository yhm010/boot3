package com.iu.boot3.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberSerive memberSerive;
	
	@ModelAttribute("member")
	public String getmember() {
		return "member";
	}
	
	@GetMapping("join")
	public ModelAndView join()throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/join");
		return mv;
	}
	
	@PostMapping("join")
	public ModelAndView join(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = memberSerive.join(memberVO);
		mv.setViewName("redirect:../");
		return mv;
	}
	
	@GetMapping("login")
	public ModelAndView login() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("member/login");
		return mv;
	}
	
	@PostMapping("login")
	public ModelAndView login(MemberVO memberVO, HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		memberVO = memberSerive.login(memberVO);
		mv.setViewName("member/login");
		
		if(memberVO!=null) {
			session.setAttribute("member", memberVO);
			mv.setViewName("redirect:../");
		return mv;	
		}
		return mv;
	}
	
	@GetMapping("delete")
	public ModelAndView delete(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		int result = memberSerive.delete(memberVO);
		session.invalidate();
		mv.setViewName("redirect:../");
		return mv;
	}
	
	@GetMapping("logout")
	public ModelAndView logout(HttpSession session)throws Exception{
		session.invalidate();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:../");
		return mv;
	}	
	
//	@GetMapping("mypage")
//	public ModelAndView mypage(HttpSession session)throws Exception{
//		ModelAndView mv = new ModelAndView();
//		MemberVO memberVO = (MemberVO)session.getAttribute("member");
//		memberVO = memberSerive.mypage(memberVO);
//		mv.addObject("member/mypage");
//		mv.addObject("vo", memberVO);
//		return mv;
//	}
	
	@GetMapping("mypage")
	public void mypage(HttpSession session, Model model) throws Exception{
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		memberVO = memberSerive.mypage(memberVO);
		model.addAttribute("vo", memberVO);
	}
	
	@GetMapping("update")
	public ModelAndView update(HttpSession session)throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberVO memberVO = (MemberVO) session.getAttribute("member");
		memberVO = memberSerive.mypage(memberVO);
		mv.setViewName("member/update");
		mv.addObject("vo", memberVO);
		return mv;
	}
	
	@PostMapping("update")
	public ModelAndView update(MemberVO memberVO)throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = memberSerive.update(memberVO);
		mv.setViewName("redirect:./mypage");
		return mv;
	}

}
