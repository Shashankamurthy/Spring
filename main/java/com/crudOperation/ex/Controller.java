package com.crudOperation.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Controller {
	@RestController
@RequestMapping("/Gadgets")

	public class CrudController {	
	@Autowired
	@Qualifier("Mobile") 

	private Gadgets G1;
	/*
	@Autowired
	public void Controller(@Qualifier("Tablet") Gadgets G1) {
	this.G1 = G1;
	}
	@Autowired
	public void setG(@Qualifier("Laptop")Gadgets G1) {
		this.G1 = G1;
	} 
	*/ 
	@GetMapping
	public String fetchdisplay() {
	return G1.show();
	}
	}
}
