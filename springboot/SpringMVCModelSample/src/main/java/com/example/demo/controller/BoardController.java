package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	 * つぶやき登録画面
	 *
	 */
	@GetMapping("/create")
	public String create(BoardForm boardForm, Model model) {

		return "board/create";
	}


	/**
	 * つぶやき登録確認画面表示
	 *
	 */
	@PostMapping("/create/confirm")
	public String createConfirm(@Validated BoardForm boardForm,
			BindingResult result,
			Model model) {
		// バリデーションチェック結果判定
		if (result.hasErrors()) {
			model.addAttribute("boardForm", boardForm);
			return "board/create";
		}

		return "board/create_confirm";
	}

	/**
	 * つぶやき登録画面へ戻る
	 *
	 */
	@PostMapping("/create")
	public String createGoBack(BoardForm boardForm, Model model) {
		return "board/create";
	}

	/**
	 * つぶやき登録処理
	 *
	 */
	@PostMapping("/store")
	public String store(@Validated BoardForm boardForm,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {

		     boardService.save(board);

		return "redirect:/board/index";
	}

}
