package com.tieuluan.struts2.dao;

import java.util.List;

import com.tieuluan.struts2.model.Product;
import com.tieuluan.struts2.utils.KPaging;



/**
 * @author Dinesh Rajput
 *
 */
public interface ProductDao {
//	void saveUser(___User user);
//	
//	List<___User> getUserList(); 
	List<Product> getProductList();
	List<Product> getProductListPaging(KPaging<Product> paging);
	public List<Product> getProductList(KPaging<Product> paging,Integer id);
	Product getProductById(Integer id);
	
}
