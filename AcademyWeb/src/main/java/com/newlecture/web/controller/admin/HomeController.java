package com.newlecture.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminHome")
@RequestMapping("/admin/")
public class HomeController {
	
	// /admin/index
	@GetMapping("index")
	public String index() {
		
		return "admin.index";
	}
	// /admin/upload
	@GetMapping("upload-ajax")
	@ResponseBody
	public String uploadAjax() {
		
		return "ok";
	}
}
