package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

		// バリデーションチェック結果判定
		if (result.hasErrors()) {
			model.addAttribute("boardForm", boardForm);
			return "board/create";
		}

		// つぶやきEntity定義
		Board board = new Board();
		// 現在日時取得
		LocalDateTime nowTime = LocalDateTime.now();
		// つぶやきフォームをつぶやき情報Entityへ詰め替え
		board.setTitle(boardForm.getTitle());
		board.setMurmur(boardForm.getMurmur());
		board.setCreate(nowTime);
		board.setUpdate(nowTime);
		// つぶやき情報登録
		boardService.save(board);

		// フラッシュメッセージを設定
		redirectAttributes.addFlashAttribute("flash", "つぶやきの登録に成功しました");

		return "redirect:/board/index";
	}

	/**
	 * つぶやき編集画面
	 *
	 */
	@GetMapping("/edit/{id}")
	public String edit(BoardForm boardForm, @PathVariable int id, Model model) {

		// つぶやき情報を取得
		Board board = boardService.getBoard(id);

		// つぶやきフォームへ詰め替え
		boardForm.setTitle(board.getTitle()); // タイトル
		boardForm.setMurmur(board.getMurmur()); // つぶやき

		// モデルに設定
		model.addAttribute("boardForm", boardForm);
		model.addAttribute("boardId", id);

		return "board/edit";
	}

	/**
	 * つぶやき編集確認画面表示
	 *
	 */
	@PostMapping("/edit/confirm")
	public String editConfirm(@Validated BoardForm boardForm,
			BindingResult result,
			@RequestParam("boardId") int id,
			Model model) {
		// バリデーションチェック結果判定
		if (result.hasErrors()) {
			// モデルに設定
			model.addAttribute("boardForm", boardForm);
			model.addAttribute("boardId", id);
			return "board/edit";
		}
		// モデルに設定
		model.addAttribute("boardForm", boardForm);
		model.addAttribute("boardId", id);

		return "board/edit_confirm";
	}

	/**
	 * つぶやき編集画面へ戻る
	 *
	 */
	@PostMapping("/edit/{id}")
	public String editGoBack(BoardForm boardForm, @PathVariable int id, Model model) {
		// モデルに設定
		model.addAttribute("boardForm", boardForm);
		model.addAttribute("boardId", id);

		return "board/edit";
	}

	/**
	 * つぶやき更新処理
	 *
	 */
	@PostMapping("/update")
	public String update(@Validated BoardForm boardForm,
			BindingResult result,
			@RequestParam("boardId") int id,
			Model model,
			RedirectAttributes redirectAttributes) {

		// バリデーションチェック結果判定
		if (result.hasErrors()) {
			// モデルに設定
			model.addAttribute("boardForm", boardForm);
			model.addAttribute("boardId", id);
			return "board/edit";
		}

		// つぶやきEntity定義
		Board board = new Board();
		// 現在日時取得
		LocalDateTime nowTime = LocalDateTime.now();
		// つぶやきフォームをつぶやき情報Entityへ詰め替え
		board.setId(id);
		board.setTitle(boardForm.getTitle());
		board.setMurmur(boardForm.getMurmur());
		board.setUpdate(nowTime);
		// つぶやき情報登録
		boardService.update(board);

		// フラッシュメッセージを設定
		redirectAttributes.addFlashAttribute("flash", "つぶやきの更新に成功しました");

		return "redirect:/board/index";
	}

	/**
	 * つぶやき削除処理
	 *
	 */
	@PostMapping("/delete")
	public String delete(@RequestParam("boardId") int id,
			Model model,
			RedirectAttributes redirectAttributes) {

		// つぶやきEntity定義
		Board board = new Board();
		board.setId(id);

		// つぶやき情報削除
		boardService.delete(id);

		// フラッシュメッセージを設定
		redirectAttributes.addFlashAttribute("flash", "つぶやきの削除に成功しました");

		return "redirect:/board/index";
		}
}
