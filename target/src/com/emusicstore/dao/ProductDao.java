package com.emusicstore.dao;

import java.util.List;

import com.emusicstore.model.Product;


public interface ProductDao {
   void addProduct(Product product);
   Product getProductById(int Id);
   List<Product> getAllProducts();
   void deleteProduct(int Id);
}
