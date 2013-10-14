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
    private String images;
    private String name;
    private String info;
    private Map<String, Object> result ;
	public String execute()	{
		return "success";
	}
	public String detailProduct()
	{
		return "success";
	}
	public String getJsonProductById()
	{
		product=productService.getProductById(id);
		
		result.put(images,product.getImage());
		result.put(name,product.getName());
		result.put(info,product.getInfo());
		
		return "json";
	}
	
	public List<Product> getLisproduct() {
		return lisproduct;
	}
	public void setLisproduct(List<Product> lisproduct) {
		this.lisproduct = lisproduct;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Map<String, Object> getResult() {
		return result;
	}
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	
	
	
	
}