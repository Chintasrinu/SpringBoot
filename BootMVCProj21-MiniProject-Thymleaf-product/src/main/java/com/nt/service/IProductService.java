package com.nt.service;

import java.util.List;

import com.nt.model.Product;

public interface IProductService {
   
    public List<Product> searchProducts(String searchText) ;
    
    public List<Product> getAllProduct();
       
}
