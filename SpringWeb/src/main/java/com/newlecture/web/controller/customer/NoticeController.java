package com.newlecture.web.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*"/admin/notice/list"
"/admin/notice/reg"
"/admin/notice/detail"
"/admin/notice/edit"*/

@Controller("customerNotice")
@RequestMapping("/customer/notice/")
public class NoticeController {
	
	@RequestMapping("list")
	@ResponseBody
	public String list(){
		
		return "notice list 입니데이";
	}
	
	@RequestMapping("detail")
	@ResponseBody
	public String detail(){
		
		return "하하하";
	}
	
	
}
