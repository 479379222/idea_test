 package com.etlo.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etlo.dao.ProductMapper;
import com.etlo.model.Product;
import com.etlo.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper productMapper;
	
	@Override
	public Product selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Product> selectByProduct() {
		// TODO Auto-generated method stub
		return productMapper.selectByProduct();
	}

	@Override
	public List<Product> selectPageByProduct(int start, int size) {
		// TODO Auto-generated method stub
		return productMapper.selectPageByProduct(start, size);
	}

	@Override
	public List<Product> selectPageParamByProduct(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return productMapper.selectPageParamProduct(map);
	}

	@Override
	public List<List<?>> selectPageParamProByProduct(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return productMapper.selectPageParamProProduct(map);
	}

	@Override
	public int saveProduct(Product pro) {
		// TODO Auto-generated method stub
		return productMapper.insert(pro);
	}

}
