package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.view.CustomExcelView;

@Controller
public class HomeController {

	@RequestMapping("/home.do")
	public String home() {
		return "home";
	}
	// mvc-context에 설정한대로 return값이 String 일때 viewResolver 의 설정대로
	// 리턴하는 값의 이름으로 파일을 찾아간다.
	
	@RequestMapping("/about.do")
	public ModelAndView about() {
		// 직접 모델앤뷰를 만들어도 된다.
		ModelAndView mav = new ModelAndView();
		mav.setViewName("about");
		
		return mav;
	}
	// ModelAndView로 return을 할경우 view가 보내지므로 viewResolver를 거치지않고
	// 바로 view가 실행이 된다.
	
	@RequestMapping("/history.do")
	public void history() {
		
	}
	// 컨트롤러를 void로 만들경우 requestMapping을 읽어들여 viewResolver를 통해
	// 파일을 찾아간다.
	
	@RequestMapping("/excel.do")
	public ModelAndView xls() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("제목", "2019년 상반기 매출현황");
		mav.addObject("매입", 100000000);
		mav.addObject("매출", 170000000);
		mav.addObject("영업이익", 70000000);
		
		mav.setView(new CustomExcelView());
		
		return mav;
		// Excel파일을 다운받을 수 있는 컨트롤러 
	}
	
	@RequestMapping("/web.do")
	public ModelAndView web() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("title", "2019년 상반기 매출현황");
		mav.addObject("buy", 100000000);
		mav.addObject("sell", 170000000);
		mav.addObject("profit", 70000000);
		
		mav.setViewName("web");
		
		return mav;
		// web에서 보여주는 컨트롤러
	}
}
