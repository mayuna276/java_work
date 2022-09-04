package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;

/**
 * @author manaf
 *
 */

@Controller
@RequestMapping("/board")
public class BoardController {

	private final BoardService boardService;

	//コンストラクタ
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}


	/**
	 * タイムライン画面
	 *
	 */
	@GetMapping("/index")
	public String index(Model model) {

		//BoardServiceからリストを取得する
		List<Board> returnList = boardService.getAll() ;

		model.addAttribute("returnList", returnList);

		return "board/index";
	}

	/**
	 * つぶやき詳細画面
	 *
	 */
	@GetMapping("/show/{id}")
	public String show(@PathVariable int id ,Model model) {
		Board board = boardService.getBoard(id) ;

		model.addAttribute("board", board);

		return "board/show";
	}

	/**
	 * つびやき登録画面
	 *
	 */
	@GetMapping("/create")
	public String create(Model model) {

		return "board/create";
	}
}
