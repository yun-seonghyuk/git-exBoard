package com.jth.exercise;

import javax.xml.ws.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jth.exercise.test.vo.TestBoardVO;

@Controller
@RequestMapping("/test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
	
	@GetMapping("/list")
	public String testList() {
		logger.info("TestController, testList.");
		return "test/testList";
	}
	@GetMapping("/detail")
	public String testDetail(Model model) {
		logger.info("TestController, testDetail");
		
		return "test/testDetail";
	}
	
	//post 전송
	@PostMapping("detail/post")
	public ResponseEntity<String> testDetailPost(@RequestBody TestBoardVO testBoardVO){
		logger.info("TestController, testDetailPost.");
		
		if(testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}
		
		ResponseEntity<String> resultEntity = null;
		 
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
		}
		return resultEntity;
	}
	
	@PutMapping("/detail/put")
	public ResponseEntity<String> testDetailPut(@RequestBody TestBoardVO testBoardVO){
		
		if(testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}
		
		ResponseEntity<String> resultEntity = null;
		 
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
		}
		return resultEntity;
	}
	
	@PostMapping("/detail/xml")
	public ResponseEntity<String> testDetailXml(@RequestBody TestBoardVO testBoardVO){
		
		logger.info("TestController, testDetailXml");
		
		if(testBoardVO != null) {
			logger.info(testBoardVO.toString());
		}
		
		ResponseEntity resultEntity = null;
		
		
		try {
			resultEntity = new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
		}catch (Exception e) {
			resultEntity = new ResponseEntity<String>("FAIL",HttpStatus.BAD_REQUEST);
		}
		return resultEntity;
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String testInsert() {
		logger.info("TestController, testInsert");
		return "test/testInsert";
	}
	
	@PostMapping(value = "/update")
	public String testUpdate() {
		logger.info("TestController, testUpdate");
		return "test/testUpdate";
	}
	
	@PostMapping(value = "/delete")
	public String testDelete() {
		logger.info("TestController, testDelete");
		return "test/testDelete";
	}
	
}
