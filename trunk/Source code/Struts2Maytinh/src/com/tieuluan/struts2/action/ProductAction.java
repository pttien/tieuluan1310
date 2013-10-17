package com.tieuluan.struts2.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tieuluan.struts2.bussines.ProductService;
import com.tieuluan.struts2.model.Product;



/**
 * @author Dinesh Rajput
 *
 */
public class ProductAction extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductService productService;
    private List<Product> lisproduct;
    private Product product;
    private Integer id;

   
	public String execute()	{
		return "success";
	}
	public String detailProduct()
	{
		return "success";
	}
	public String getJsonProductById()
	{
		result = new HashMap<String, Object>();
		product=productService.getProductById(id);
		
		result.put("product",product);
		
		
		return JSON;
	}
	public List<Product> getLisproduct() {
		return lisproduct;
	}
	public void setLisproduct(List<Product> lisproduct) {
		this.lisproduct = lisproduct;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	

	
	
}