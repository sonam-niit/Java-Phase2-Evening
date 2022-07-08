package com.simplilearn.springbootdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String hello() {
		return "Welcome from Springboot App";
	}
	
	@GetMapping("/data")
	public ResponseEntity<Object> getData(){
		return new ResponseEntity<Object>(new Student(1, "Sonam Soni"),HttpStatus.FOUND);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable("id") String id){
		if(id.contentEquals("0"))
			throw new ProductNotFoundException("No product available with 0 id");
		else
			return new ResponseEntity<Object>("Product Found",HttpStatus.FOUND);
	}
}
