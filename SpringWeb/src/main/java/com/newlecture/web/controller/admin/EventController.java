package com.newlecture.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/event/")
public class EventController {
	
	@RequestMapping("list")
	@ResponseBody
	public String list(){
		
		return "admin event list 입니데이";
	}
	
	
}
