package com.etlo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.etlo.model.Product;

public interface ProductService {
	public Product selectByPrimaryKey(int id);
	public List<Product> selectByProduct();
	public List<Product> selectPageByProduct(int start, int size);
	public List<Product> selectPageParamByProduct(Map<String, Object> map);
	public List<List<?>> selectPageParamProByProduct(Map<String, Object> map);
	public int saveProduct(Product pro);
}
