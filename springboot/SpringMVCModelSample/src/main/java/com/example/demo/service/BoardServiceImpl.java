package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {

	private final BoardDao dao;
	//コンストラクタ
	public BoardServiceImpl(BoardDao dao) {
		this.dao = dao;
	}
	@Override
	public List<Board> getAll() {

		//BoardDaoImplへデータを返却する
		return dao.findAll();
	}
}
