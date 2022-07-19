package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TestController {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@GetMapping("test")
	public String test(Model model) {
		String sql ="SELECT name, email FROM user WHERE id=1001";
		List<String> user = jdbcTemplate.queryForList(sql);
		model.addAttribute("UserList", user);

		return "test";
	}
}
