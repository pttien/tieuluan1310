package com.tieuluan.struts2.bussines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tieuluan.struts2.dao.ProductDao;
import com.tieuluan.struts2.model.Product;


/**
 * @author Dinesh Rajput
 *
 */
@Service("userService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
//	@Override
//	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)  
//	public void saveUser(___User user) {
//		userDao.saveUser(user);
//	}
//
	@Override
	public List<Product> getProductList() {
		return productDao.getProductList();
	}
	@Override
	public List<Product> getProductListByrowNum() {
		return productDao.getProductListByrowNum();
	}
	public Product getProductById(Integer id){
		return productDao.getProductById(id);
	}
	

}