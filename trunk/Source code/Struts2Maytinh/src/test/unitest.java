package test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.tieuluan.struts2.bussines.ProductService;
import com.tieuluan.struts2.dao.ProductDao;
import com.tieuluan.struts2.model.Product;

public class unitest extends ActionSupport{
	@Autowired
	private ProductService productService;
	
	private List<Product> lst;
	
	public static void main(String[] args)
	{
//		lst=pro
	
	}

	public List<Product> getLst() {
		return lst;
	}

	public void setLst(List<Product> lst) {
		this.lst = lst;
	}

	
	
}
