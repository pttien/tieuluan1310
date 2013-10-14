package com.tieuluan.struts2.bussines;

import java.util.List;

import com.tieuluan.struts2.model.Product;
import com.tieuluan.struts2.utils.KPaging;



/**
 * @author Dinesh Rajput
 *
 */
public interface ProductService {
//	void saveUser(___User user);
//	
	List<Product> getProductList();
	List<Product> getProductListPaging(KPaging<Product> paging);
	Product getProductById(Integer id);
}
