package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {

	private final BoardService boardService;

	//コンストラクタ
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("index")
	public String index(Model model) {

		//BoardServiceからリストを取得する
		List<Board> returnList = boardService.getAll() ;

		return "board/index";
	}
}
