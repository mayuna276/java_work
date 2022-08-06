package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Board;
import com.example.demo.repository.BoardDao;

@Service
@Component

public class BoardServiceImpl implements BoardService {

	private final BoardDao dao;
	//コンストラクタ
	public BoardServiceImpl(BoardDao dao) {
		this.dao = dao;
	}

	@Autowired
	BoardService boardservice;
	@Override
	public List<Board> getAll() {

		//BoardDaoImplへデータを返却する
		return dao.findAll();
	}
}
