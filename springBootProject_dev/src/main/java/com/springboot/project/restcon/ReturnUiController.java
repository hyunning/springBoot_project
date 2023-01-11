package com.springboot.project.restcon;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ReturnUiController {

	@RequestMapping("/test")
	public Object returnUrlInfo() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("view", "이래도 한글이 깨질거야????");
		mv.addObject("time", new Date());
		mv.setViewName("/views/viewTest");
			
		return mv;
		
	}
}
