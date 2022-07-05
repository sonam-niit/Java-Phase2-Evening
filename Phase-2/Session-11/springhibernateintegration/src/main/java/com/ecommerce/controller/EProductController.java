package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.ecommerce.entity.EProductEntity;
import com.ecommerce.service.EProductService;

@Controller
public class EProductController {

	@Autowired
	private EProductService eProductService;
	
	public String listProduct(ModelMap map) {
		map.addAttribute("eproduct",new EProductEntity());
		map.addAttribute("productlist", eProductService.getAllProducts());
		return "productlist";
	}
}
