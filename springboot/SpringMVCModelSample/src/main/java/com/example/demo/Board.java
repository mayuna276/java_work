package com.example.demo;

import java.sql.Timestamp;

/**
 * Board
 *
 */

//コンストラクタ
public class Board {
	private String title;
	private String murmur;
	private Timestamp update;

	// getter
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
