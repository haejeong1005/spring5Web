package com.newlecture.web.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.newlecture.web.entity.Notice;

/*"/admin/notice/list"
"/admin/notice/reg"
"/admin/notice/detail"
"/admin/notice/edit"*/

@Controller("adminNotice")
@RequestMapping("/admin/notice/")
public class NoticeController {
	
	@RequestMapping("list")	
	public String list(){
		
		//return "/WEB-INF/views/admin/notice/list.jsp";
		//return "admin/notice/list";
		return "admin.notice.list";
	}
	
	//@RequestMapping(value="reg", method=RequestMethod.GET)
	@GetMapping("reg")
	public String reg(){
		
		//return "admin/notice/reg";
		return "admin.notice.reg";
	}
	
	//@RequestMapping(value="reg", method=RequestMethod.POST)
	@PostMapping("reg")
	public String reg(/* Notice notice */
			@RequestParam("t") String title, 
			@RequestParam(value="c", defaultValue="내용없음") String content,
			MultipartFile file
			/* HttpServletRequest request */){
		
		/*
		 * String title = request.getParameter("title"); 
		 * String content = request.getParameter("content");
		 */
		
		/*Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		System.out.println(title);
		System.out.println(content);*/
		System.out.println(title);
		System.out.println(content);
		System.out.println(file.getOriginalFilename());
		
		//file.getInputStream();
		
		//?.insert(notice);
		
		//System.out.println(notice.getTitle());
		
		return "redirect:list";
	}
	
	@RequestMapping("detail")	
	public String detail(){
		
		return "admin/notice/detail";
	}
	
	@RequestMapping("edit")	
	public String edit(){
		
		return "admin/notice/edit";
	}
	
}
