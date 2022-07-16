package com.example.demo.controller;

import java.util.List;
import java.util.Map;

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
		List<Map<String, Object>> user = jdbcTemplate.queryForList("select * from user");
		model.addAttribute("UserList", user);

		return "test";
	}
}
