package com.jth.exercise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jth.exercise.test.vo.OrderRequest;

// 스프링 폼 태그
@Controller
public class SpringFormController {
	private static final Logger logger = LoggerFactory.getLogger(SpringFormController.class);
	
	@GetMapping("/springform/registerForm")
	public String registerForm(Model model) throws Exception{
		
		logger.info("springFormController, registerForm");
		
		model.addAttribute("orderRequest",new OrderRequest());
		return "springForm/registerForm";
	}
	
	// 스프링폼 데이터 전달
	@PostMapping("/springform/register")
	public String springFormRegisterPost(OrderRequest orderRequest) throws Exception{
		
		logger.info("springFormController, registerForm");
		
		logger.info("데이터확인 : {}",orderRequest.getOrderRequestNo());
		logger.info("데이터확인 : {}",orderRequest.getOrderRequestDate());
		logger.info("데이터확인 : {}",orderRequest.getItemNm());
		
		return "springForm/result";
	}
	
	
}
