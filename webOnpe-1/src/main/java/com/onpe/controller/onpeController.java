package com.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.onpe.service.TotalService;

public class onpeController {
 
	@Autowired
	TotalService totalService;
	
	@GetMapping("/total")
	public String getTotal(Model model) {
		model.addAttribute("total",totalService.getTotal());
		return "total";
	}
}
