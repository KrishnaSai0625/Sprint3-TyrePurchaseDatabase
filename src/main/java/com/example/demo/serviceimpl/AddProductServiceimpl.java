package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Addproduct;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.AddProductRepo;
import com.example.demo.service.AddProductService;

@Service
public class AddProductServiceimpl implements AddProductService{
	
	
	@Autowired
	AddProductRepo addProductRepo;

	@Override
	public Addproduct addProduct(Addproduct addProduct) {
		// TODO Auto-generated method stub
		return addProductRepo.save(addProduct);
	}

	@Override
	public Addproduct updatedb(String ProductName, Addproduct addProduct) {
		// TODO Auto-generated method stub
Addproduct s1 = addProductRepo.findByName(ProductName);
		
		if(s1!=null) {
			s1.setDescription(addProduct.getDescription());
			s1.setImgurl(addProduct.getImgurl());
			return addProductRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String ProductName) {
		// TODO Auto-generated method stub
		Addproduct s2 = addProductRepo.findByName(ProductName);
		if(s2!=null) {
			addProductRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}
	}
}
