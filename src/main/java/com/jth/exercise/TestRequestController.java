package com.jth.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jth.exercise.test.vo.PurChaseRequestVO;

@Controller
public class TestRequestController {

	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@GetMapping("/test/request/list")
	public String list() {
		
		return "test/request/tRequestList";
	}
	
	@GetMapping("/test/request/regist")
	public ResponseEntity<String> getRegist(String boardId, String boardContent, String boardWriter){
		
		ResponseEntity<String> reStr = null;
		
		logger.info("boardId : {}",boardId);
		logger.info("boardContent : {}",boardContent);
		logger.info("boardWriter : {}",boardWriter);
		
		reStr = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		
		return reStr;
	}
	
	@GetMapping("test/request/registVO")
	public ResponseEntity<String> getRegistVO(PurChaseRequestVO purChaseRequestVO){
		
		ResponseEntity<String> result = null;
		
		logger.info("purChaseRequestVO : {}",purChaseRequestVO);
		logger.info("purChaseRequestVO.toString() : {}",purChaseRequestVO.toString());
		
		result = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		
		return result;
		
	}
}
