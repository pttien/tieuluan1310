package com.tieuluan.struts2.dao;

import java.util.List;

import javassist.convert.Transformer;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.tieuluan.struts2.model.Product;
import com.tieuluan.struts2.utils.KPaging;



/**
 * @author Dinesh Rajput
 *
 */
@Repository("userDao")  
public class ProductDaoImpl implements ProductDao {

	@Autowired  
	private SessionFactory sessionFactory;  
	
//	@Override
//	public void saveUser(___User user) {
//		sessionFactory.getCurrentSession().saveOrUpdate(user);
//	}
//
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductList() {
		return (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class).list();
	}
	@Override
	public List<Product> getProductListPaging(KPaging<Product> paging) {
		return (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setFirstResult(paging.getPage() * paging.getMaxResult())
				.setMaxResults(paging.getMaxResult()).addOrder(Order.desc("created_at")).list();
	}
	@Override
	public Product getProductById(Integer id){
        
        	Product product = null;
        	product=(Product)sessionFactory.getCurrentSession().createCriteria(Product.class).add(Restrictions.eq("id", id));    
        	return product;
     
    }


}
