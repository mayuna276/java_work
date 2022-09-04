package com.example.demo.repository;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotEnpty;
import javax.validation.constraints.Size;

public class BoardForm {

	@NotEmpty(message="タイトルの入力は必須です")
	@Size(max=20,message="タイトルは20文字以内で入力してください")

}
