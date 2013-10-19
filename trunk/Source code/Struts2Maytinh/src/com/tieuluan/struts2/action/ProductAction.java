package com.tieuluan.struts2.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tieuluan.struts2.bussines.ProductService;
import com.tieuluan.struts2.model.Product;
import com.tieuluan.struts2.utils.KPaging;
import com.tieuluan.struts2.utils.StringUtil;



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
    private String name_factory;
    private String name_catalogy;
    private String pice_product;
    
   
	public String getName_catalogy() {
		return name_catalogy;
	}
	public void setName_catalogy(String name_catalogy) {
		this.name_catalogy = name_catalogy;
	}
	public String execute()	{
		return "success";
	}
	public String detailProduct()
	{
		//Lay gia trij doi truong product
		product=productService.getProductById(id);
		String tmp=product.getInfo();
		tmp=StringUtil.clearAllHTMLTags(tmp);
		tmp=StringUtil.convertHTMLCodeToString(tmp);
		product.setInfo(tmp);
		name_factory=product.getFactory().getName();
		name_catalogy=product.getCategogy().getName();
		pice_product=StringUtil.formatMoneyComma(product.getPice().toString());
		//Lay danh sach 
		KPaging<Product> paging =new KPaging<Product>();
		paging.setPage(0);
		paging.setMaxResult(3);
		lisproduct=productService.getProductList(paging, product.getId());
		if(null!=lisproduct&&lisproduct.size()>0){
			for(int i=0;i<lisproduct.size();i++){
				if(StringUtil.isNullOrEmpty(lisproduct.get(i).getInfo())==false){
					String tmpp=lisproduct.get(i).getInfo();
					tmpp=StringUtil.clearAllHTMLTags(tmpp);
					tmpp=StringUtil.convertHTMLCodeToString(tmpp);
					if(tmpp.length()> 100){
						tmpp=tmpp.substring(0,100)+"...";
					}
					lisproduct.get(i).setInfo(tmpp);
				}
			}
		}
		return "success";
		
		
	}
	public String getJsonProductById()
	{
		result = new HashMap<String, Object>();
		product=productService.getProductById(id);
		String tmp=product.getInfo();
		tmp=StringUtil.clearAllHTMLTags(tmp);
		tmp=StringUtil.convertHTMLCodeToString(tmp);
		product.setInfo(tmp);
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
	public String getName_factory() {
		return name_factory;
	}
	public void setName_factory(String name_factory) {
		this.name_factory = name_factory;
	}
	public String getPice_product() {
		return pice_product;
	}
	public void setPice_product(String pice_product) {
		this.pice_product = pice_product;
	}	
	
	
}