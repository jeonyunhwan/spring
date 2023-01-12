package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//url 맵핑까지해줘야함 ㅇㅋ?
@Controller //폴더개념으로 처리해줘야 바람직함ㅇㅋ?
public class HomeController{
	
	@RequestMapping("/index")
	public String index() {
		//tiles 화면 
		//서블릿 출력도구를 통한 출력 
		return "index";
	}
/*
 * 
 * PrintWriter out = response.getWriter();
		out.println("hello");
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("root.index1");
		mv.addObject("data", "hello Spring MVC");
		//mv.setViewName("/WEB-INF/view/index1.jsp");
		
		return mv;
	}
	*/
}
