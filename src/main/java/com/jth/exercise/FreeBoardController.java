package com.jth.exercise;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/freeboard")
public class FreeBoardController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(FreeBoardController.class);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET )
	public String freeboardList() {
		return "freeBoardList";
	}
	
	@GetMapping(value = "/insert")
	public String freeboardInsert() {
		return "freeBoardInsert";
	}
	
	@GetMapping(value = "/modify") // 이게 표준
	public String freeBoardModify() {
		return "freeboard/freeBoardModify";
	}
}
