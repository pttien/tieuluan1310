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
public class Home extends AbstractAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ProductService productService;
    private List<Product> lisproduct;
    private String content;
	public String execute()	{
		KPaging<Product> paging =new KPaging<Product>();
		paging.setPage(0);
		paging.setMaxResult(3);
		lisproduct=productService.getProductListPaging(paging);
		if(null!=lisproduct&&lisproduct.size()>0){
			for(int i=0;i<lisproduct.size();i++){
				if(StringUtil.isNullOrEmpty(lisproduct.get(i).getInfo())==false){
					String tmp=lisproduct.get(i).getInfo();
					tmp=StringUtil.clearAllHTMLTags(tmp);
					tmp=StringUtil.convertHTMLCodeToString(tmp);
					if(tmp.length()> 100){
						tmp=tmp.substring(0,100)+"...";
					}
					lisproduct.get(i).setInfo(tmp);
				}
			}
		}
		return "success";
	}
	
	public List<Product> getLisproduct() {
		return lisproduct;
	}
	public void setLisproduct(List<Product> lisproduct) {
		this.lisproduct = lisproduct;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
		
	
}