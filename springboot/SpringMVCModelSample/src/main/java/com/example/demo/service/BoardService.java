package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Board;

public interface BoardService {
	List<Board> getAll();

	Board getBoard(int id);

	void save(Board board);

	void update(Board board);

	void delete(int id);
}
