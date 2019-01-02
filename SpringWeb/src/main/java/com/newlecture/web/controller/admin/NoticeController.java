package com.newlecture.web.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newlecture.web.entity.Notice;

/*"/admin/notice/list"
"/admin/notice/reg"
"/admin/notice/detail"
"/admin/notice/edit"*/

@Controller("adminNotice")
@RequestMapping("/admin/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	@ResponseBody
	public String list(){
		
		return "admin notice list 입니데이";
	}
	
	//@RequestMapping(value="reg", method=RequestMethod.GET)
	@GetMapping("reg")
	@ResponseBody
	public String reg(){
		
		return "/WEB-INF/views/admin/notice/reg.jsp";
	}
	
	//@RequestMapping(value="reg", method=RequestMethod.POST)
	@PostMapping("reg")
	public String reg(Notice notice/*String title, String content*/ /* HttpServletRequest request */){		
		/*
		 * String title = request.getParameter("title"); 
		 * String content = request.getParameter("content");
		 */
		
		/*Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		System.out.println(title);
		System.out.println(content);*/
		
		//?.insert(notice);
		
		System.out.println(notice.getTitle());
		
		return "redirect:list";
	}
	
	@RequestMapping("detail")
	@ResponseBody
	public String detail(){
		
		return "하하하";
	}
	
	@RequestMapping("edit")
	@ResponseBody
	public String edit(){
		
		return "하하하";
	}
	
}
