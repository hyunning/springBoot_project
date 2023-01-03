package com.springboot.project.test.hyun;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.vo.testClassVO;

@RestController
public class testClass {

	
	@GetMapping("/info")
	public String projectInfo() {
		return "안녕하세요. 이 프로젝트는 일단 임시로 만들어보았습니다.ggg";
	}
	
	@GetMapping("/info02")
	public Object projectInfo02() {
		testClassVO tcVo = new testClassVO();
		tcVo.author = "hyun";
		//tcVo.author = null;
		tcVo.projectNm = "test";
		tcVo.createData = new Date();
		
		return tcVo;
	}

}
