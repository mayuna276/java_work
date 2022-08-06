package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Board;

@Repository
public class BoardDaoImpl implements BoardDao {
	public JdbcTemplate jdbcTemplate;

@Override
	public List<Board> findAll() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM boards ORDER BY updated_at desc");

		//抽出したデータを返却する用の変数
		List<Board> returnList = new ArrayList<>();

		//取得したデータを返却用の変数に格納する
		for (Map<String, Object> map : list) {

			Board board = new Board();  //boardインスタンスの生成
			board.setTitle((String) map.get("title"));
			board.setMurmur((String) map.get("murmur"));
			board.setUpdate((Timestamp) map.get("updated"));

			//返却用のreturnListにデータを格納
			returnList.add(board);
		}
		 return returnList;
	}

}
