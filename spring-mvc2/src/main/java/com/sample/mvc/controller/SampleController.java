package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@RequestMapping("/list.do")		// pno를 가져오는데  없어도 된다(false) 그럴때 "1"을 준다
	public String list(@RequestParam(value="pno", required = false, defaultValue = "1") int pno) {
		
		return "list";
	}
	
	// 같은 url이어도 요청메소드 방식으로 구분이 가능하다.
	@RequestMapping(value="/register.do", method = RequestMethod.GET)
	public String form() {
		return "registerform";
	}
	
	@RequestMapping(value="/register.do", method = RequestMethod.POST)
	public String register(String name, String id, String password, String email) {
		
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이메일 : " + email);
		
		return "redirect:list.do";
	}
}
