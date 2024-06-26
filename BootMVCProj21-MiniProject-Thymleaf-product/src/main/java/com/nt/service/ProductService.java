package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Product;
import com.nt.repository.ProductRepository;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;

	@Override
	public List<Product> searchProducts(String searchText) {
		 return productRepository.findByNameContainingIgnoreCase(searchText);
    }

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}
	}
	


