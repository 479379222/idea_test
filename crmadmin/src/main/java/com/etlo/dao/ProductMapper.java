package com.etlo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.etlo.model.Product;

public interface ProductMapper {
	
	List<Product> selectByProduct();
	
	List<Product> selectPageByProduct(@Param("start") Integer start, @Param("size") Integer size);
	
	List<Product> selectPageParamProduct(Map<String, Object> parameterMap);
	
	List<List<?>> selectPageParamProProduct(Map<String, Object> parameterMap);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}