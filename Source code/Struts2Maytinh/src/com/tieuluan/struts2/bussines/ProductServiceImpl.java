package com.tieuluan.struts2.bussines;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tieuluan.struts2.dao.ProductDao;
import com.tieuluan.struts2.model.Product;
import com.tieuluan.struts2.utils.KPaging;


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
	public List<Product> getProductListPaging(KPaging<Product> paging) {
		return productDao.getProductListPaging(paging);
	}
	@Override
	public Product getProductById(Integer id){
		return productDao.getProductById(id);
	}
	@Override
	public List<Product> getProductList(KPaging<Product> paging,Integer id) {
		return productDao.getProductList(paging, id);
	}
	
}
