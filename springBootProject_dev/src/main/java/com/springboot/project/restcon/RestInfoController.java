package com.springboot.project.restcon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestInfoController {

	//private final Logger logger = LogManager.getLogger(WebConnection.class);
	@GetMapping("/info")
	public String projectInfo() {
		System.out.println("==============================");
		return "Project name is springBootProjectt_dev";
	}
}
