package com.inframart.service;

import org.springframework.web.multipart.MultipartFile;

import com.inframart.model.Product;

public interface ProductService {
	
	void addProduct(Product product, MultipartFile productImmage);

}
