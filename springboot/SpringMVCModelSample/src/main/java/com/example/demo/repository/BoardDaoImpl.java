package com.example.demo.repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Board;

@Repository
public class BoardDaoImpl implements BoardDao {
	private final JdbcTemplate jdbcTemplate;

@Autowired
	public BoardDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


@Override

	/**findAllメソッド
	 *
	 */
	public List<Board> findAll() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM boards ORDER BY updated_at desc");

		//抽出したデータを返却する用の変数
		List<Board> returnList = new ArrayList<Board>();

		//取得したデータを返却用の変数に格納する
		for (Map<String, Object> map : list) {

			Board board = new Board();  //boardインスタンスの生成
			board.setId((int)map.get("id"));
			board.setTitle((String) map.get("title"));
			board.setMurmur((String) map.get("content"));
			board.setUpdate(((Timestamp) map.get("updated_at")).toLocalDateTime());

			//返却用のreturnListにデータを格納
			returnList.add(board);
		}
		 return returnList;
	}

	/**findByIdメソッド
	 *つぶやきidを元にboardsテーブルのレコードを1件取得する
	 */

	  public Board findById(int id) {
		Map<String, Object> detailList = jdbcTemplate.queryForMap("SELECT * FROM boards where id = ?",id);

		Board board = new Board(); //boardインスタンスの生成

		board.setId((int)detailList.get("id"));
		board.setTitle((String)detailList.get("title"));
		board.setMurmur((String)detailList.get("content"));
		board.setUpdate(((Timestamp)detailList.get("updated_at")).toLocalDateTime());

		 return board;
	}

	  /**insertメソッド
		 *boardsテーブルへ1件登録する
		 */

	  public void insert(Board board) {
		  jdbcTemplate.update("INSERT INTO boards(title,content) Value(?,?)",
				  board.getTitle(),board.getMurmur());

		}

}
