package com.example.demo.entity;


import java.time.LocalDateTime;

/**
 * Boardエンティティ
 *
 */

//コンストラクタ
public class Board {
	private int id;
	private String title;
	private String murmur;
	private LocalDateTime update;
	private LocalDateTime create;

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

	public LocalDateTime getUpdate() {
		return update;
	}

	public LocalDateTime getCreate() {
		return create;
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

	public void setUpdate(LocalDateTime update) {
		this.update = update;
	}

	public void setCreate(LocalDateTime create) {
		this.create = create;
	}
}
