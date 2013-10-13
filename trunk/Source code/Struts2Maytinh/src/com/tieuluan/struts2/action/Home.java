package com.tieuluan.struts2.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tieuluan.struts2.bussines.ProductService;
import com.tieuluan.struts2.model.Product;



/**
 * @author Dinesh Rajput
 *
 */
public class Home extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductService productService;
    private List<Product> lisproduct;
	public String execute()	{
//		users = CommonUtility.createUserBeanList(userService.getUserList());
//		listuser =userService.getUserList();
		lisproduct=productService.getProductList();
		return "success";
	}
	public List<Product> getLisproduct() {
		return lisproduct;
	}
	public void setLisproduct(List<Product> lisproduct) {
		this.lisproduct = lisproduct;
	}

}