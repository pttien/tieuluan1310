package com.tieuluan.struts2.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tieuluan.struts2.bussines.ProductService;
import com.tieuluan.struts2.model.Product;
import com.tieuluan.struts2.utils.KPaging;



/**
 * @author Dinesh Rajput
 *
 */
public class Home extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductService productService;
    private List<Product> lisproduct;
    private Product product;
	public String execute()	{
		KPaging<Product> paging =new KPaging<Product>();
		paging.setPage(0);
		paging.setMaxResult(3);
		lisproduct=productService.getProductListPaging(paging);
		return "success";
	}
	public List<Product> getLisproduct() {
		return lisproduct;
	}
	public void setLisproduct(List<Product> lisproduct) {
		this.lisproduct = lisproduct;
	}
	public Product getProductById(Integer id)
	{
		return product;
	}

}