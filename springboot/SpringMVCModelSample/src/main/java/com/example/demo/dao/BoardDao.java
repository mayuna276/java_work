package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.Board;

@Repository
@RequiredArgsConstructor


public interface BoardDao {

	public JdbcTemplate jdbcTemplate;

	public List<Board> findAll() {
		List<Map<String , Object>> list = jdbcTemplate.queryForList("SELECT * FROM boards");

		//抽出したデータを返却する用の変数
		List<String> board = new ArrayList<>();

		//取得したデータを返却用の変数に格納する
		for (Map<String, Object> map :list) {

			board.setTitle((String) map.get("title"));
			board.setMurmur((String) map.get("murmur"));

		}

	}
}
