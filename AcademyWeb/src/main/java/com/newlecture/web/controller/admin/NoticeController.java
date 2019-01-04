package com.newlecture.web.controller.admin;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

/*"/admin/notice/list"
"/admin/notice/reg"
"/admin/notice/detail"
"/admin/notice/edit"*/

@Controller("adminNotice")
@RequestMapping("/admin/notice/")
public class NoticeController {
	
	@Autowired
	private SqlSessionTemplate session;
	
	@RequestMapping("list")	// list?p=1&q=hello&f=title
	public String list(
			  @RequestParam(name="p", defaultValue="1") Integer page
			, @RequestParam(name="q", defaultValue="") String query
			, @RequestParam(name="f", defaultValue="title") String field
			, Model model){
		
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		List<NoticeView> list = noticeDao.getViewList(page,query, field);
		
		model.addAttribute("list", list);
		
		//return "/WEB-INF/views/admin/notice/list.jsp";
		//return "admin/notice/list";
		return "admin.notice.list";
	}

	// http://server/academy/admin/notice/detail?id=2
	// http://server/academy/admin/notice/2
	@RequestMapping("{id}")
	public String detail(
				@PathVariable("id") Integer id /* 경로를 담는 변수? */
			,	Model model){
		
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		NoticeView notice = noticeDao.getNoticeView(id);
		
		model.addAttribute("notice", notice);
		
		return "admin.notice.detail";
	}
	
	//@RequestMapping(value="reg", method=RequestMethod.GET)
	@GetMapping("reg")
	public String reg(){
		
		//return "admin/notice/reg";
		return "admin.notice.reg";
	}
	
	//@RequestMapping(value="reg", method=RequestMethod.POST)
	@PostMapping("reg")
	public String reg(Notice notice){
		
		notice.setWriterId("newlec");
		
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		int affected = noticeDao.insert(notice);
		
		return "redirect:list";
		
		
		/*
		 * String title = request.getParameter("title"); 
		 * String content = request.getParameter("content");
		 */
		
		/*Notice notice = new Notice();
		notice.setTitle(title);
		notice.setContent(content);
		System.out.println(title);
		System.out.println(content);*/
		
		/*
		 * System.out.println(title); System.out.println(content);
		 * System.out.println(file.getOriginalFilename());
		 */
		
		//file.getInputStream();
		
		//?.insert(notice);
		
		//System.out.println(notice.getTitle());
		
		
	}
	
	
	// /admin/notice/1/edit
	// /admin/notice/edit/1
	@GetMapping("{id}/edit")	
	public String edit(@PathVariable("id") Integer id){
		
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		Notice notice = noticeDao.getNotice(id);
		
		return "admin.notice.edit";
	}
	
	@PostMapping("{id}/edit")
	public String edit(Notice temp){
		
		NoticeDao noticeDao = session.getMapper(NoticeDao.class);
		Notice notice = noticeDao.getNotice(temp.getId());
		notice.setTitle(temp.getTitle());
		notice.setContent(temp.getContent());
		
		
		
		return "redirect:"+notice.getId();
	}
	
}
