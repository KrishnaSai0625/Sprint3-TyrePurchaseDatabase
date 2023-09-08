package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Addproduct;

@Repository
public interface AddProductRepo extends JpaRepository<Addproduct, Integer>{
	@Query(value =  "select * from Addproduct where Productname =?" , nativeQuery = true)
	Addproduct findByName(String Productname);
}
