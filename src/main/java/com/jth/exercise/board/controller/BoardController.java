package com.jth.exercise.board.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jth.exercise.board.service.BoardService;
import com.jth.exercise.board.service.impl.BoardServiceImpl;
import com.jth.exercise.board.vo.BoardVO;

@Controller
public class BoardController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired
	private BoardService boardService; 
	
	// 저장화면 이동
	@GetMapping("/board/register")
	public String boardRegister(Model model) throws Exception{
		
		logger.info("BoardController, boardRegister");
		
		return "board/register";
	}
	
	// 저장 동작
	@PostMapping("/board/register")
	public String boardRegisterPost(BoardVO boardVO) throws Exception{
		
		logger.info("BoardController, boardRegisterPost.");
		logger.info("boardVOtoString {}",boardVO.toString());
		int result = boardService.insertBoard(boardVO);
		
		logger.info("result : {}", result);
		
		return "board/result";
	}
	
	
	// 목록 하면 이동
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String boardList(Model model) throws Exception{
		
		logger.info("BoardController, boardList.");
		
		List<BoardVO> resultList = boardService.selectBoarList();
		logger.info("resultList : {}", resultList.toString());
		
		model.addAttribute("resultList",resultList);
		
		return "board/list";
	}
	
	// 게시판 상세
	@GetMapping("/board/detail")
	public String boardDetail(Model model, BoardVO boardVO) throws Exception{
		
		logger.info("BoardController, boardList.");
		
		// 임시
		
		BoardVO resultData = boardService.selectBoardDetail(boardVO);
		
		model.addAttribute("resultData",resultData);
		
		return "board/detail";
		
	}
	@GetMapping("/board/modify")
	public String boardModify(Model model , BoardVO boardVO) throws Exception{
		
		logger.info("BoardController, boardList.");
		
		BoardVO resultData = boardService.selectBoardDetail(boardVO);
		logger.info("resultData : {}", resultData.toString());
		model.addAttribute("resultData",resultData);
		return "board/modify";
		
	}
	
	@PostMapping("/board/modify")
	public String boardModifyPost(BoardVO boardVO) throws Exception{
		
		logger.info("BoardController, boardModifyPost.");
		int result = boardService.updateBoard(boardVO);
		logger.info("result : {}",result);
		return "board/result";
	}
	// 삭제
	@PostMapping("/board/delete")
	public String boardDeletePost(BoardVO boardVO) throws Exception{
		
		logger.info("BoardController, boardDeletePost.");
		int result = boardService.deleteBoard(boardVO);
		logger.info("result : {}",result);
		
		return "board/result";
	}
}
