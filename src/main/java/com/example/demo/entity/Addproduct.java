package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Addproduct {
	@Id
	private String Productname;
	private String Description;
	private String Imgurl;
	public String getProductname() {
		return Productname;
	}
	public void setProductname(String productname) {
		this.Productname = productname;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public String getImgurl() {
		return Imgurl;
	}
	public void setImgurl(String imgurl) {
		this.Imgurl = imgurl;
	}
}
