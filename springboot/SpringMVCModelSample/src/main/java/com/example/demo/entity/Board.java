package com.example.demo.entity;


import java.sql.Timestamp;

/**
 * Boardエンティティ
 *
 */

//コンストラクタ
public class Board {
	private int id;
	private String title;
	private String murmur;
	private Timestamp update;

	// getter

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getMurmur() {
		return murmur;
	}

	public Timestamp getUpdate() {
		return update;
	}

	//setter
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setMurmur(String murmur) {
		this.murmur = murmur;
	}

	public void setUpdate(Timestamp update) {
		this.update = update;
	}
}
