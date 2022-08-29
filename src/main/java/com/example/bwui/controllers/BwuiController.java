package com.example.bwui.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BwuiController {
	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/server")
	public String config_index(Model model) {
		return "config_index";
	}

	@GetMapping("/server/create")
	public String config_create(Model model) {
		return "config_create";
	}

	@GetMapping("/zone")
	public String zone_index(Model model) {
		return "zone_index";
	}

	@GetMapping("/*")
	public String notFound(Model model) {
		return "_404.html";
	}
}
