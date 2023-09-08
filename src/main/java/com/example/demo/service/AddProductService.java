package com.example.demo.service;

import com.example.demo.entity.Addproduct;

public interface AddProductService {
	Addproduct addProduct(Addproduct addProduct);
	Addproduct updatedb(String ProductName, Addproduct addProduct);
	
	void Delete(String ProductName);
}