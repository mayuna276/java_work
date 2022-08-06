package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Board;

public interface BoardDao {
	List<Board> findAll();
}
