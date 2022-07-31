package com.example.demo.controller;

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
		Map<String , Object> user = jdbcTemplate.queryForMap("SELECT name, email FROM user WHERE id=1001");

		String name = (String) user.get("name");
		String email = (String) user.get("email");

		model.addAttribute("name", name);
		model.addAttribute("email", email);

		return "test";
	}
}
