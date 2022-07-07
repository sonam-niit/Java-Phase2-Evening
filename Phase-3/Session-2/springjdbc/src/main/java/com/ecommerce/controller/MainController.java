package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.dao.EProductDao;
import com.ecommerce.entity.EProductEntity;

@Controller
public class MainController {

	@Autowired
	EProductDao dao;
	
	@GetMapping("/listproducts")
	public String getAllProducts(ModelMap map) {
		
		List<EProductEntity> list= dao.getAllProducts();
		map.addAttribute("list",list);
		return "products";
	}
}
