package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Addproduct;
import com.example.demo.service.AddProductService;

@RestController
public class AddProductController {
	@Autowired
	AddProductService addProductService;
	
	@PostMapping("/post")
	public Addproduct addProduct(@RequestBody Addproduct addProduct) {
		
		return addProductService.addProduct(addProduct);
	}
	
	@PutMapping("/update")
	public Addproduct update(@RequestHeader String Productname, @RequestBody Addproduct  addProduct) {
		
		return addProductService.updatedb(Productname, addProduct);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String Productname) {
		addProductService.Delete(Productname);
		return "Data was deleted";
	}
}

