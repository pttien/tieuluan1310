package com.tieuluan.struts2.bussines;

import java.util.List;

import com.tieuluan.struts2.model.Product;



/**
 * @author Dinesh Rajput
 *
 */
public interface ProductService {
//	void saveUser(___User user);
//	
	List<Product> getProductList();
	List<Product> getProductListByrowNum();
	Product getProductById(Integer id);
}
