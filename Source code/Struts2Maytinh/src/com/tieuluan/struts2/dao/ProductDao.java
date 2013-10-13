package com.tieuluan.struts2.dao;

import java.util.List;

import com.tieuluan.struts2.model.Product;



/**
 * @author Dinesh Rajput
 *
 */
public interface ProductDao {
//	void saveUser(___User user);
//	
//	List<___User> getUserList(); 
	List<Product> getProductList();
	List<Product> getProductListByrowNum();
	Product getProductById(Integer id);
	
}
