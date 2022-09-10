package com.example.demo.controller;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BoardForm {

	//タイトルのエラーメッセージ
	@NotNull(message = "タイトルの入力は必須です")
	@Size(min = 1, max = 20, message = "タイトルは20文字以内で入力してください")
	private String title;

	//つぶやきのエラーメッセージ
	@NotNull(message = "つぶやきの入力は必須です")
	@Size(min = 1, max = 140, message = "つぶやきは140文字以内で入力してください")
	private String murmur;



	public BoardForm() {
	}

	public BoardForm(String title, String murmur) {
		super();
		this.title = title;
		this.murmur = murmur;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMurmur() {
		return murmur;
	}

	public void setMurmur(String murmur) {
		this.murmur = murmur;
	}
}